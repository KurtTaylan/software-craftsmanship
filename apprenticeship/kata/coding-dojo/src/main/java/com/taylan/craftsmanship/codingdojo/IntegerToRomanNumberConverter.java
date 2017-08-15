package com.taylan.craftsmanship.codingdojo;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRomanNumberConverter {

    Map<Integer, String> mapping = new LinkedHashMap<Integer, String>() {{
        put(1000, "M");
        put(500, "D");
        put(100, "C");
        put(50, "L");
        put(10, "X");
        put(5, "V");
        put(1, "I");
    }};

    public String convert(int input) {
        StringBuilder builder = new StringBuilder();

        if (mapping.containsKey(input)) {
            return mapping.get(input);
        }

        if (input == 400 || input == 900) {
            builder.append("C");
            builder.append(mapping.get(input + 100));
            return builder.toString();
        }

        if (input == 40 || input == 90) {
            builder.append("X");
            builder.append(mapping.get(input + 10));
            return builder.toString();
        }

        if (input == 4 || input == 9) {
            builder.append("I");
            builder.append(mapping.get(input + 1));
            return builder.toString();
        }

        for (Integer key : mapping.keySet()) {
            if (input > key) {
                builder.append(mapping.get(key));
                for (int i = 0; i < input - key; i++) {
                    builder.append("I");
                }
                return builder.toString();
            }
        }

        return builder.toString();
    }
}
