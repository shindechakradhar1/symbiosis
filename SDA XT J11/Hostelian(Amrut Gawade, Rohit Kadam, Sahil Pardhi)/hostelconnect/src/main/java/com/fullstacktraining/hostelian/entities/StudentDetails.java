package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
//@Table(name = "student_")
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studDetailsId;

    @NotNull(message = "Enter middle name")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    private String middleName;

    @NotNull(message = "Enter Emergency Contact number")
    @Pattern(regexp = "^\\d{10}$\n", message = "Only Ten digits")
    private Integer egycontactno;
    @NotNull(message = "Enter guardian name")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    private String guardianName;
    @NotNull(message = "Enter guardian relationship")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    private String guardianRelation;

    @NotNull(message = "Enter Emergency Contact number")
    @Pattern(regexp = "^\\d{10}$\n", message = "Only Ten digits")
    private Integer guardianContactno;
    @NotNull(message = "Enter correspondence address")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    @Min(value = 5, message = "Minimum 5 Characters")
    private String corresAddress;

    @NotNull(message = "Enter correspondence city")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabet letters")
    @Min(value = 5, message = "Minimum 1 Characters")
    private String corresCity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;
    private String corresState;
    private Integer corresPincode;
    private String pmntAddress;
    private String pmntCity;
    private String pmnatetState;
    private Integer pmntPincode;
    private Timestamp postingDate;
    private Timestamp updationDate;
    private Timestamp stayFrom;
    private Integer duration;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentDetailId")
    private List<Fees> fees;

    public StudentDetails() {
    }

    public StudentDetails(Long studDetailsId, String middleName, Integer egycontactno, String guardianName, String guardianRelation, Integer guardianContactno, String corresAddress, String corresCity, Course course, String corresState, Integer corresPincode, String pmntAddress, String pmntCity, String pmnatetState, Integer pmntPincode, Timestamp postingDate, Timestamp updationDate) {
        this.studDetailsId = studDetailsId;
        this.middleName = middleName;
        this.egycontactno = egycontactno;
        this.guardianName = guardianName;
        this.guardianRelation = guardianRelation;
        this.guardianContactno = guardianContactno;
        this.corresAddress = corresAddress;
        this.corresCity = corresCity;
        this.course = course;
        this.corresState = corresState;
        this.corresPincode = corresPincode;
        this.pmntAddress = pmntAddress;
        this.pmntCity = pmntCity;
        this.pmnatetState = pmnatetState;
        this.pmntPincode = pmntPincode;
        this.postingDate = postingDate;
        this.updationDate = updationDate;
    }

    public StudentDetails(String middleName, Integer egycontactno, String guardianName, String guardianRelation, Integer guardianContactno, String corresAddress, String corresCity, Course course, String corresState, Integer corresPincode, String pmntAddress, String pmntCity, String pmnatetState, Integer pmntPincode, Timestamp postingDate, Timestamp updationDate) {
        this.middleName = middleName;
        this.egycontactno = egycontactno;
        this.guardianName = guardianName;
        this.guardianRelation = guardianRelation;
        this.guardianContactno = guardianContactno;
        this.corresAddress = corresAddress;
        this.corresCity = corresCity;
        this.course = course;
        this.corresState = corresState;
        this.corresPincode = corresPincode;
        this.pmntAddress = pmntAddress;
        this.pmntCity = pmntCity;
        this.pmnatetState = pmnatetState;
        this.pmntPincode = pmntPincode;
        this.postingDate = postingDate;
        this.updationDate = updationDate;
    }

    public Long getStudDetailsId() {
        return studDetailsId;
    }

    public void setStudDetailsId(Long studDetailsId) {
        this.studDetailsId = studDetailsId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getEgycontactno() {
        return egycontactno;
    }

    public void setEgycontactno(Integer egycontactno) {
        this.egycontactno = egycontactno;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianRelation() {
        return guardianRelation;
    }

    public void setGuardianRelation(String guardianRelation) {
        this.guardianRelation = guardianRelation;
    }

    public Integer getGuardianContactno() {
        return guardianContactno;
    }

    public void setGuardianContactno(Integer guardianContactno) {
        this.guardianContactno = guardianContactno;
    }

    public String getCorresAddress() {
        return corresAddress;
    }

    public void setCorresAddress(String corresAddress) {
        this.corresAddress = corresAddress;
    }

    public String getCorresCity() {
        return corresCity;
    }

    public void setCorresCity(String corresCity) {
        this.corresCity = corresCity;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCorresState() {
        return corresState;
    }

    public void setCorresState(String corresState) {
        this.corresState = corresState;
    }

    public Integer getCorresPincode() {
        return corresPincode;
    }

    public void setCorresPincode(Integer corresPincode) {
        this.corresPincode = corresPincode;
    }

    public String getPmntAddress() {
        return pmntAddress;
    }

    public void setPmntAddress(String pmntAddress) {
        this.pmntAddress = pmntAddress;
    }

    public String getPmntCity() {
        return pmntCity;
    }

    public void setPmntCity(String pmntCity) {
        this.pmntCity = pmntCity;
    }

    public String getPmnatetState() {
        return pmnatetState;
    }

    public void setPmnatetState(String pmnatetState) {
        this.pmnatetState = pmnatetState;
    }

    public Integer getPmntPincode() {
        return pmntPincode;
    }

    public void setPmntPincode(Integer pmntPincode) {
        this.pmntPincode = pmntPincode;
    }

    public Timestamp getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Timestamp postingDate) {
        this.postingDate = postingDate;
    }

    public Timestamp getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Timestamp updationDate) {
        this.updationDate = updationDate;
    }

    public Timestamp getStayFrom() {
        return stayFrom;
    }

    public void setStayFrom(Timestamp stayFrom) {
        this.stayFrom = stayFrom;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Fees> getFees() {
        return fees;
    }

    public void setFees(List<Fees> fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studDetailsId=" + studDetailsId +
                ", middleName='" + middleName + '\'' +
                ", egycontactno=" + egycontactno +
                ", guardianName='" + guardianName + '\'' +
                ", guardianRelation='" + guardianRelation + '\'' +
                ", guardianContactno=" + guardianContactno +
                ", corresAddress='" + corresAddress + '\'' +
                ", corresCity='" + corresCity + '\'' +
                ", course=" + course +
                ", corresState='" + corresState + '\'' +
                ", corresPincode=" + corresPincode +
                ", pmntAddress='" + pmntAddress + '\'' +
                ", pmntCity='" + pmntCity + '\'' +
                ", pmnatetState='" + pmnatetState + '\'' +
                ", pmntPincode=" + pmntPincode +
                ", postingDate=" + postingDate +
                ", updationDate=" + updationDate +
                ", stayFrom=" + stayFrom +
                ", duration=" + duration +
                ", room=" + room +
                ", fees=" + fees +
                '}';
    }
}
