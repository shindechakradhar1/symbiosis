package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Long> {

}
