package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//
//    @NotEmpty
//    @NotNull
//
//    private String employer;
    private Skill skills;

    //constructors
    public Job() {
    }

    public Job(Employer employer, Skill skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }
}
