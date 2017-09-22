package com.refactoring.firstexample;

public class TextStatement extends Statement {

    @Override
    protected String footerString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
                "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + "frequent renter points";
    }

    @Override
    protected String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each._movie._price.getCharge(each, each._movie)) + "\n";
    }

    @Override
    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
