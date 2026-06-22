package com.victordev.jobhunterbot.model;

import com.victordev.jobhunterbot.enums.*;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Job {

    // ATRIBUTOS

    private UUID id;

    private String company;
    private String position;
    private String url;
    private String location;
    private String description;
    private String publishedText;

    private LocalDateTime foundAt;
    private LocalDateTime lastSeenAt;

    private boolean active;

    private JobStatus status;
    private Category category;
    private Seniority seniority;

    private Set<WorkMode> workModes;
    private Set<Technology> technologies;

    public Job() {
    }

    public Job(UUID id, String company, String position, String url, String location, String description, String publishedText, LocalDateTime foundAt, LocalDateTime lastSeenAt, boolean active, JobStatus status, Category category, Seniority seniority, Set<WorkMode> workModes, Set<Technology> technologies) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.url = url;
        this.location = location;
        this.description = description;
        this.publishedText = publishedText;
        this.foundAt = foundAt;
        this.lastSeenAt = lastSeenAt;
        this.active = active;
        this.status = status;
        this.category = category;
        this.seniority = seniority;
        this.workModes = workModes;
        this.technologies = technologies;
    }

    // METODOS

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }


    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }


    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }


    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getPublishedText() {
        return publishedText;
    }
    public void setPublishedText(String publishedText) {
        this.publishedText = publishedText;
    }


    public LocalDateTime getFoundAt() {
        return foundAt;
    }
    public void setFoundAt(LocalDateTime foundAt) {
        this.foundAt = foundAt;
    }


    public LocalDateTime getLastSeenAt() {
        return lastSeenAt;
    }
    public void setLastSeenAt(LocalDateTime lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }


    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }


    public JobStatus getStatus() {
        return status;
    }
    public void setStatus(JobStatus status) {
        this.status = status;
    }


    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }


    public Seniority getSeniority() {
        return seniority;
    }
    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }


    public Set<WorkMode> getWorkModes() {
        return workModes;
    }
    public void setWorkModes(Set<WorkMode> workModes) {
        this.workModes = workModes;
    }


    public Set<Technology> getTechnologies() {
        return technologies;
    }
    public void setTechnologies(Set<Technology> technologies) {
        this.technologies = technologies;
    }
}
