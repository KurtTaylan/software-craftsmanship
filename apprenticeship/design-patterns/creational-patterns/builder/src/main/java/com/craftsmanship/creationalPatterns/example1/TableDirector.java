package com.craftsmanship.creationalPatterns.example1;

import java.io.BufferedReader;
import java.io.FileReader;

public class TableDirector {

    private Builder m_builder;


    public TableDirector(Builder target) {
        m_builder = target;
    }

    public void construct(String file_name) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file_name))) {
            String line;
            String cells[];

            if((line = bufferedReader.readLine()) != null) {
                cells = line.split("\\t");
                int width = Integer.parseInt(cells[0]);
                int height = Integer.parseInt(cells[1]);
                m_builder.set_width_and_height(width,height);
            }

            while ((line = bufferedReader.readLine()) != null) {
                cells = line.split("\\t");
                for (int col = 0; col < cells.length; ++col) {
                    m_builder.build_cell(cells[col]);
                }
                m_builder.start_row();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
