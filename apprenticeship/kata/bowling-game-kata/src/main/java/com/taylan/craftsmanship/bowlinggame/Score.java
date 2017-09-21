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

        return value.equals(score.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Score{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
