package com.luv2code.ecommerce.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty; // Import the annotation

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_category")
@Getter
@Setter
public class ProductCategory {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    @JsonProperty("id") // Specify the JSON property name
    private Long id;

    @Column(name="category_name")
    @JsonProperty("category_name") // Specify the JSON property name
    private String categoryName;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="category")
    @JsonProperty("products") // Specify the JSON property name
    private Set<Product> products;
}
