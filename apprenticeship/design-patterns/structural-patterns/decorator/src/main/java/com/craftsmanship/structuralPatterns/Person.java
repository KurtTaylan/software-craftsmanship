package com.craftsmanship.structuralPatterns;

public class Person {

    private String username;
    private PersonalId personalId;

    public Person(PersonalId personalId) {
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
