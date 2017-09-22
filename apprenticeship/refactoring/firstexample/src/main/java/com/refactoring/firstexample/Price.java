package com.refactoring.firstexample;

public abstract class Price {

    abstract double getCharge(int daysRented);

    abstract int getPriceCode();

    int getFrequentRenterPoints(int rentedDays) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && rentedDays > 1)
            return 2;
        else
            return 1;
    }
}