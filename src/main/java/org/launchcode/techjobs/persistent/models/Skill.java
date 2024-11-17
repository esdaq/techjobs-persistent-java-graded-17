package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    @Size(min = 3, max = 50, message = "Description must be between 3 and 50 characters")
    private String description;

    public @Size(min = 3, max = 50, message = "Description must be between 3 and 50 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 3, max = 50, message = "Description must be between 3 and 50 characters") String description) {
        this.description = description;
    }



    public Skill() {}
}
