package com.example.doctors.service.doctormicroservicedemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctors")
    public String getDoctors(){
        return "list of Doctors";
    }
}
