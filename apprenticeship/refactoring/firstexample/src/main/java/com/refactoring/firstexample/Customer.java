package com.refactoring.firstexample;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental rental) {
        _rentals.addElement(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement(Customer customer) {
        return new TextStatement().value(this);
    }

    public String htmlStatement(Customer customer) {
        return new HtmlStatement().value(this);
    }

    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            result += each._movie._price.getFrequentRenterPoints(each.getDaysRented(), each._movie);
        }

        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            result += each._movie._price.getCharge(each.getDaysRented(), each._movie);
        }

        return result;
    }

    public Vector getRentals() {
        return _rentals;
    }
}
