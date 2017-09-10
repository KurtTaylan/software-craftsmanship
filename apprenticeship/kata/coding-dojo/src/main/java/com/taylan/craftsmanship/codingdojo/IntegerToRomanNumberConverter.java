package com.taylan.craftsmanship.codingdojo;

import java.util.HashMap;
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

    Map<Integer, Integer> chipper = new HashMap<Integer, Integer>() {{
        put(1000, 100);
        put(500, 100);
        put(100, 10);
        put(50, 10);
        put(10, 1);
        put(5, 1);
        put(1, 1);
    }};


    public String convert(int input) {
        if (mapping.containsKey(input)) {
            return mapping.get(input);
        }

        for (Integer key : mapping.keySet()) {
            if (key - chipper.get(key) == input) {
                return appendPrefix(input, chipper.get(key));
            } else if (input > key) {
                return appendSuffix(input, key);
            }
        }
        throw new IllegalArgumentException("Example is not valid");
    }

    private String appendSuffix(int input, Integer key) {
        StringBuilder builder = new StringBuilder();
        builder.append(mapping.get(key));
        for (int i = 0; i < input - key; i++) {
            builder.append("I");
        }
        return builder.toString();
    }

    private String appendPrefix(int input, int i) {
        StringBuilder builder = new StringBuilder();
        builder.append(mapping.get(chipper.get(input + i))); // prefix
        builder.append(mapping.get(input + i)); // Main
        return builder.toString();
    }
}
