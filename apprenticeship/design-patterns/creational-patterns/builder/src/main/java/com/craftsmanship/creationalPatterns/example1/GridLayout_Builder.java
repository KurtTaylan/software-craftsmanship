package com.craftsmanship.creationalPatterns.example1;

import javax.swing.*;
import java.awt.*;

public class GridLayout_Builder implements Builder {

    private JPanel m_panel = new JPanel();


    @Override
    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridLayout(height,width));
        m_panel.setBackground(Color.white);
    }

    @Override
    public void start_row() {
    }

    @Override
    public void build_cell(String value) {
        m_panel.add(new Label(value));
    }

    @Override
    public Component get_result() {
        return m_panel;
    }
}
