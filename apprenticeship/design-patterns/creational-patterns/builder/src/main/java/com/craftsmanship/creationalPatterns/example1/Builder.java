package com.craftsmanship.creationalPatterns.example1;

import java.awt.*;

public interface Builder {

    void set_width_and_height(int width, int height);

    void start_row();

    void build_cell(String value);

    Component get_result();

}
