package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.services.FeesServiceImpl;
import com.fullstacktraining.hostelian.services.interfaces.FeesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/fees")
public class FeesController {
    @Autowired
    private FeesService feesService;

    //Fee Entity CRUD Operations
    @PostMapping("/addFees")
    public ResponseEntity<Fees> addNewFees(@Valid @RequestBody Fees fees){
        return feesService.addFees(fees);
    }
    @GetMapping("/feesDetails")
    public List<Fees> getFeesDetails(){
        return feesService.getAllFees();
    }
    @DeleteMapping("/deletefees/{feeId}")
    public ResponseEntity<String> deleteFees(@PathVariable Long feeId){
        return feesService.deleteFeesDetails(feeId);
    }
    @GetMapping("/feesdetails/{feeId}")
    public ResponseEntity<Fees> getUniqueFeesDetails(@PathVariable Long feeId){
        return feesService.getUniqueFee(feeId);
    }
}
