package com.example.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
