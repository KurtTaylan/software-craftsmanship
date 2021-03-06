package com.refactoring.firstexample;

public class Rental {

    Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    double getCharge() {
        return _movie._price.getCharge(_daysRented, _movie);
    }

    int getFrequentRenterPoints(int days) {
        return _movie._price.getFrequentRenterPoints(days, _movie);
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }
}
