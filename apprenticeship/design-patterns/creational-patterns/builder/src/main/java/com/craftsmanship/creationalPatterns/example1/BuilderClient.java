package com.craftsmanship.creationalPatterns.example1;

import javax.swing.*;
import java.awt.*;

public class BuilderClient {

    public static void main(String[] args) {
        (new BuilderClient()).demo(args);
    }


    private void demo(String[] args) {
        String class_name = args.length > 0 ? args[0] : "JTable_Builder";

        Builder target = null;

        try {
            target = (Builder) Class.forName(getClass().getName() + "$" + class_name)
                                                        .getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        String file_name = getClass().getResource("BuilderDemo.dat").getFile();
        TableDirector director = new TableDirector(target);
        director.construct(file_name);
        Component component = target.get_result();

        JFrame frame = new JFrame("Builder Demo - " + class_name );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(component);
        frame.pack();
        frame.setVisible(true);
    }

}
