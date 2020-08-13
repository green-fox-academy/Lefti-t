package com.greenfox.error.model.models;

import com.greenfox.error.model.service.UserService;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by aze on 25/10/17.
 */

public class User extends UserService {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
