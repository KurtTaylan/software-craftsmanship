package com.taylan.craftsmanship.codingdojo;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNumberConverter {

    Map<Integer, String> mapping = new HashMap<Integer, String>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");

    }};

    public String convert(int input) {
        StringBuilder builder = new StringBuilder();

        if (mapping.containsKey(input)) {
            return mapping.get(input);
        }

        if (input == 4 || input == 9) {
            builder.append("I");
            builder.append(mapping.get(input + 1));
            return builder.toString();
        }

        if (input > 10) {
            builder.append("X");
            for (int i = 0; i < input - 10; i++) {
                builder.append("I");
            }
            return builder.toString();
        }

        if (input > 5) {
            builder.append("V");
            for (int i = 0; i < input - 5; i++) {
                builder.append("I");
            }
            return builder.toString();
        }

        if (input > 1) {
            builder.append("I");
            for (int l = 0; l < input - 1; l++) {
                builder.append("I");
            }
        }
        9return builder.toString();
    }
}
