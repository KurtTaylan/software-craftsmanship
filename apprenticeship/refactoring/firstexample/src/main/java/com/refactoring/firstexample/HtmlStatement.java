package com.refactoring.firstexample;

public class HtmlStatement extends Statement {

    @Override
    protected String footerString(Customer customer) {
        return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM></P>\n" +
                "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points <P>";
    }

    @Override
    protected String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    @Override
    protected String headerString(Customer customer) {
        return "<H1>Rental Record for <EM> " + customer.getName() + "</EM></H1><P>\n";
    }
}
