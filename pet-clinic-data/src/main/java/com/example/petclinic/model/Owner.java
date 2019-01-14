package com.example.petclinic.model;

public class Owner extends Person {

    public Owner() {
    }

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
