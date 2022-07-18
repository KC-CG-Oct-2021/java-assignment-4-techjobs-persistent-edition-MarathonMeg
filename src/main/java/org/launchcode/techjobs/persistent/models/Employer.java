package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location may not be blank")
    @Size( min = 2, max = 100, message = "Location must be 2-100 characters long")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    //add a private property jobs of type List<Job> and initialize it to an empty ArrayList.
    private final List<Job> jobs = new ArrayList<>();



    //constructors
    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

    //getter and setter
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


}
