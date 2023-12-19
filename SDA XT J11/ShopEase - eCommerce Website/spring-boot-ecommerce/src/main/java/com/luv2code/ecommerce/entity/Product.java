package com.luv2code.ecommerce.entity;


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty; // Import the annotation

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id",nullable=false)
    private ProductCategory category;

    @Column(name="sku")
    @JsonProperty("sku") // Specify the JSON property name
    private String sku;

    @Column(name="name")
    @JsonProperty("name") // Specify the JSON property name
    private String name;

    @Column(name="description")
    @JsonProperty("description") // Specify the JSON property name
    private String description;

    @Column(name="unit_price")
    @JsonProperty("unit_price") // Specify the JSON property name
    private BigDecimal unitPrice;

    @Column(name="image_url")
    @JsonProperty("image_url") // Specify the JSON property name
    private String imageUrl;

    @Column(name="active")
    @JsonProperty("active") // Specify the JSON property name
    private boolean active;

    @Column(name="units_in_stock")
    @JsonProperty("units_in_stock") // Specify the JSON property name
    private int unitsInStock;

    @Column(name="date_created")
    @CreationTimestamp
    @JsonProperty("date_created") // Specify the JSON property name
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    @JsonProperty("last_updated") // Specify the JSON property name
    private Date lastUpdated;
}
