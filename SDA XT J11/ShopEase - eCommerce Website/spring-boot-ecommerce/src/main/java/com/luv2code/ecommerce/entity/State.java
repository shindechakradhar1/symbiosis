package com.luv2code.ecommerce.entity;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @JsonProperty("name") 
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonProperty("country") // Specify the JSON property name
    private Country country;

    // Getters and setters
}
