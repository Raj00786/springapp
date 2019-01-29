package com.example.springApp;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {


    private String firstname;

    @NotNull(message="is required")
    @Size(min=2, message="is required")
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
