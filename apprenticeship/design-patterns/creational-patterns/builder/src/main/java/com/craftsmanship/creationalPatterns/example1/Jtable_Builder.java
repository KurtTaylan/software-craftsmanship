package com.craftsmanship.creationalPatterns.example1;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class Jtable_Builder implements Builder{

    private JTable m_table;
    private TableModel m_model;
    private int x = 0, y = 0;

    @Override
    public void set_width_and_height(int width, int height){
        m_table = new JTable(height,width);
        m_model = m_table.getModel();
    }

    @Override
    public void start_row() {
        x = 0;
        ++y;
    }

    @Override
    public void build_cell(String value) {
        m_model.setValueAt(value, y,  x++);
    }

    @Override
    public Component get_result()  {

        return m_table;
    }


}
