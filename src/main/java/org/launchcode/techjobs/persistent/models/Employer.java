package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotEmpty
    @NotNull
    @Size( min = 2, max = 100)
    public String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

}
