package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.Fees;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FeesService {

    ResponseEntity<Fees> addFees(Fees fees);

    List<Fees> getAllFees();

    ResponseEntity<String> deleteFeesDetails(Long feeId);

    ResponseEntity<Fees> getUniqueFee(Long feeId);
}
