package com.refactoring.firstexample;

import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = headerString(customer);
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }
        result += footerString(customer);
        return result;
    }

    protected abstract String footerString(Customer customer);

    protected abstract String eachRentalString(Rental each);

    protected abstract String headerString(Customer customer);
}
