package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    @JsonProperty("code") // Specify the JSON property name
    private String code;

    @Column(name = "name")
    @JsonProperty("name") // Specify the JSON property name
    private String name;

    @OneToMany(mappedBy = "country")
    @JsonProperty("states") // Specify the JSON property name
    private List<State> states;

    // Getters and setters
}
