package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.Fees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeesRepository extends JpaRepository<Fees,Long> {
}
