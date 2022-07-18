package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotNull (message ="Description cannot be blank")
    @Size(min = 1, max = 100, message = "Description must be 1-100 characters long")
    private String description;


    public List<Job> getJobs() {
        return jobs;
    }
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