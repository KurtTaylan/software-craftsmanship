package com.taylan.craftsmanship.codingdojo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRomanNumberConverter {

    Map<Integer, String> mapping = new LinkedHashMap<Integer, String>() {{
        put(10, "X");
        put(5, "V");
        put(1, "I");
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
