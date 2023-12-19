package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeId;
    @NotNull(message = "Enter fee amount")
    @Min(value = 1)
    private Integer feeAmount;
    private Timestamp paymentDate;

    @ManyToOne
    private StudentDetails studentDetails;

    public Fees() {
    }

    public Fees(Long feeId, Integer feeAmount,StudentDetails studentDetails, Timestamp paymentDate) {
        this.feeId = feeId;
        this.feeAmount = feeAmount;
        this.studentDetails = studentDetails;
        this.paymentDate = paymentDate;
    }

    public Fees(Integer feeAmount,StudentDetails studentDetails , Timestamp paymentDate) {
        this.feeAmount = feeAmount;
        this.studentDetails = studentDetails;
        this.paymentDate = paymentDate;
    }

    public Long getFeeId() {
        return feeId;
    }

    public void setFeeId(Long feeId) {
        this.feeId = feeId;
    }

    public Integer getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    @Override
    public String toString() {
        return "Fees{" +
                "feeId=" + feeId +
                ", feeAmount=" + feeAmount +
                ", paymentDate=" + paymentDate +
                ", studentDetails=" + studentDetails +
                '}';
    }
}
