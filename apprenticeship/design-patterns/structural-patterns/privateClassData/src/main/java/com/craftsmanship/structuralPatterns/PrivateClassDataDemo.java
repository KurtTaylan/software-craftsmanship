package com.craftsmanship.structuralPatterns;

public class PrivateClassDataDemo {

    public static void main(String[] args) {
        PersonalId personalId = new PersonalId("12385738547");
        Person person = new Person(personalId);
        person.setUsername("taylan");

        System.out.println(person.getUsername());
        System.out.println(person.getPersonalId().getId());
    }
}
