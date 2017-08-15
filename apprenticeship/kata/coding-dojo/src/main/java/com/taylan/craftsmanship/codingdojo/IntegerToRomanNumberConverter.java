package com.taylan.craftsmanship.codingdojo;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNumberConverter {

    Map<Integer, String> mapping = new HashMap<Integer, String>() {{
        put(5, "V");
        put(10, "X");
        put(50, "L");

    }};

    public String convert(int i) {
        StringBuilder builder = new StringBuilder();

        if (i == 11)
            return "XI";
        else if (i == 12)
            return "XII";
        else if (i == 13)
            return "XIII";


        if (i == 4 || i == 9) {
            builder.append("I");
            builder.append(mapping.get(i + 1));
            return builder.toString();
        }

        if (i > 5 && i < 10) {
            builder.append("V");
            for (int l = i; l > 5; l--)
                builder.append("I");
            return builder.toString();
        }

        if (i >= 5) {
            return mapping.get(i);
        }

        for (int l = 0; l < i; l++) {
            builder.append("I");
        }
        return builder.toString();
    }
}
