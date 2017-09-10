package com.craftsmanship.structuralPatterns.example2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 8 shared HandlerThreads in a ThreadPool
 * <p>
 * The ColorBox class has now become a Flyweight: the color changing and painting capability remains "intrinsic",
 * and the threaded behavior has been made "extrinsic".
 * <p>
 * The ThreadPool class plays the role of the Factory. As ColorBox objects are created, they register themselves with
 * the ThreadPool object. The latter launches 8"handler" threads. When each thread is swapped into the CPU,
 * it selects a random Flyweight from the ThreadPool's cache, and asks the object to changeColor().
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        int size = 8;
        int pause = 100;
        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        }
        if (args.length > 1) {
            pause = Integer.parseInt(args[1]);
        }
        ThreadPool tp = new ThreadPool(pause);
        Frame frame = new Frame("ColorBoxes - 8 shared HandlerThreads");
        frame.setLayout(new GridLayout(size, size));
        for (int i = 0; i < size * size; i++) {
            frame.add(new ColorBox(tp));
        }
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tp.start();
    }
}