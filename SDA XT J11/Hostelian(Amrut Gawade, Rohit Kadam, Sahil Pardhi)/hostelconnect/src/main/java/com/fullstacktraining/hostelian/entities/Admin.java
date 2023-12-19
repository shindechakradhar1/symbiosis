package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    @Timestamp
    private Date regDate;
    @Column(nullable = false, name = "updation_date")
    private Date updationDate;


    public Admin() {
    }

    public Admin(Long id, String username, String email, String password, Date regDate, Date updationDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.regDate = regDate;
        this.updationDate = updationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", regDate=" + regDate +
                ", updationDate=" + updationDate +
                '}';
    }
}
