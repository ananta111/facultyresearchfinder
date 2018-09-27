package com.claflin.facultyresearches.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Data
public class ResearchProject {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;


    private String name;
    private String department;
    private String description;

    @ManyToOne
    private Faculty faculty;


    public ResearchProject(String name, String department, String description) {
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public ResearchProject(String name, String department, String description, Faculty faculty) {
        this.name = name;
        this.department = department;
        this.description = description;
        this.faculty = faculty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
