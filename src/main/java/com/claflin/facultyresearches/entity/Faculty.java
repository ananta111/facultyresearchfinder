package com.claflin.facultyresearches.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Data
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private String name;
    private String department;

    @Email
    private String email;


    private String phoneNumber;

    public Faculty(String name, String department, @Email String email, String phoneNumber) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
