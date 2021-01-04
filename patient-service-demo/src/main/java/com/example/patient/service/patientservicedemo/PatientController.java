package com.example.patient.service.patientservicedemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/patients")
    public String patientData(){
        return "list of patients";
    }

}
