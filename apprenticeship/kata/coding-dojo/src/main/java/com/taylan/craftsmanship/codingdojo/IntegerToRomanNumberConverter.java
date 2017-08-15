package com.taylan.craftsmanship.codingdojo;

public class IntegerToRomanNumberConverter {

    public String convert(int i) {
        StringBuilder builder = new StringBuilder();
        for (int l = 0; l < i; l++) {
            builder.append("I");
        }
        return builder.toString();
    }
}
