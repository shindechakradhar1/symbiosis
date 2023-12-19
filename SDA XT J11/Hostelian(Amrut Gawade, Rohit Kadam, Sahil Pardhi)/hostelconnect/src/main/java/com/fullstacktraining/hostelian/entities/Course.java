package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    @NotNull(message = "Course Code Can not be null")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    private String courseCode;
    @NotNull(message = "Course name can not be null")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    private String courseName;
    private Timestamp postingDate;

    public Course() {
    }

    public Course(Long courseId, String courseCode, String courseName, Timestamp postingDate) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.postingDate = postingDate;
    }

    public Course(String courseCode, String courseName, Timestamp postingDate) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.postingDate = postingDate;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Timestamp getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Timestamp postingDate) {
        this.postingDate = postingDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", postingDate=" + postingDate +
                '}';
    }
}
