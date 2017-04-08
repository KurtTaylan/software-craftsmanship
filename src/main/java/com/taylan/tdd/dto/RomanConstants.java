package com.taylan.tdd.dto;


public enum RomanConstants {

    M(1000, 100),
    D(500, 100),
    C(100, 10),
    L(50, 10),
    X(10, 1),
    V(5, 1),
    I(1, 1),
    Error(0, 0);

    private final int value;
    private final int backValue;

    RomanConstants(int value, int backValue) {
        this.value = value;
        this.backValue = backValue;
    }


    public int getValue() {
        return value;
    }

    public int getBackValue() {
        return backValue;
    }
}
