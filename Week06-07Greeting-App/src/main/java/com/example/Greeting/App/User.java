package com.example.Greeting.App;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String firstname = "Adarsh";
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
