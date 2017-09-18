package com.taylan.craftsmanship.bowlinggame;

public class Score {

    private Integer value;

    public Score(Integer value) {
        this.value = value;
    }

    public String getValue() {
        if(value == 10)
            return "";
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        return value != null ? value.equals(score.value) : score.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
