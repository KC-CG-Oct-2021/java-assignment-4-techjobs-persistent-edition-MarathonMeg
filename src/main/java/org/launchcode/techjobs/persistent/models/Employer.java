package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location may not be blank")
    @Size( min = 2, max = 100, message = "Location must be 2-100 characters long")
    public String location;

    //constructors
    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

    //getter and setter
    public String getLocation() {
        return location;
    }
    public void setLocation(String saint_louis) {
    }


}
