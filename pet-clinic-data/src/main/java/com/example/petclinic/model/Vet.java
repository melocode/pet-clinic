package com.example.petclinic.model;

public class Vet extends Person {

    public Vet() {
    }

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

}
