package com.craftsmanship.creationalPatterns.example1;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout_Builder implements Builder{

    private JPanel m_panel = new JPanel();
    private GridBagConstraints constraints = new GridBagConstraints();
    private int x = 0, y = 0;


    @Override
    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridBagLayout());
        m_panel.setBackground(Color.WHITE);
    }

    @Override
    public void start_row() {
        x  = 0;
        ++y;
    }

    @Override
    public void build_cell(String value) {
        constraints.gridx = this.x++;
        constraints.gridy = this.y;
        m_panel.add(new Label(value));
    }

    @Override
    public Component get_result() {
        return m_panel;
    }
}
