package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String course;
    private char gender;
    private Long phoneNumber;
    private String emailId;
    private String password;
    @OneToOne
    @JoinColumn(name = "studentDetailsId")
    private StudentDetails studentDetails;


    // Getters and setters

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String course, char gender, Long phoneNumber, String emailId, String password, StudentDetails studentDetails) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.password = password;
        this.studentDetails = studentDetails;
    }

    public Student(String firstName, String lastName, String course, char gender, Long phoneNumber, String emailId, String password, StudentDetails studentDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.password = password;
        this.studentDetails = studentDetails;
    }

    public Student(String firstName, String lastName, String course, char gender, Long phoneNumber, String emailId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.password = password;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", studentDetails=" + studentDetails +
                '}';
    }
}
