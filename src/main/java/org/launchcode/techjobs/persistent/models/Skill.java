package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull (message ="Description cannot be blank")
    @Size(min = 1, max = 100, message = "Description must be 1-100 characters long")
    public String description;

        //constructors
    public Skill(String description) {
        this.description = description;
    }

    public Skill () {}

        //getter and setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}