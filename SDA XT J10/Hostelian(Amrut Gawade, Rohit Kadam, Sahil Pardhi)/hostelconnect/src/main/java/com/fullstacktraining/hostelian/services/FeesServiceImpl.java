package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.CustomExceptionClasses.DataDeletionException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.repositories.FeesRepository;
import com.fullstacktraining.hostelian.services.interfaces.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FeesServiceImpl implements FeesService {

    @Autowired
    private FeesRepository feesRepository;

    public FeesServiceImpl() {
    }

    //Fees Entity CRUD Operations
    @Override
    public ResponseEntity<Fees> addFees(Fees fees) {
        try {
            Fees fee = feesRepository.save(fees);
            return new ResponseEntity<>(fee, HttpStatus.CREATED);
        }catch (Exception ex){
            throw new DataInsertionException("Something went wrong");
        }
    }

    @Override
    public List<Fees> getAllFees() {
        return feesRepository.findAll();
    }

    @Override
    public ResponseEntity<String> deleteFeesDetails(Long feeId) {
        if (feesRepository.existsById(feeId))
            feesRepository.deleteById(feeId);
        else
            throw new DataDeletionException("There is no fee details with id "+feeId);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Fees> getUniqueFee(Long feeId) {
        Fees fee = feesRepository.findById(feeId).orElse(null);
        if (fee==null)
            throw new DataFetchingException("There is no fees details with id "+feeId);
        return new ResponseEntity<>(fee,HttpStatus.FOUND);
    }
}
