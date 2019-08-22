package com.tcs.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.hospital.domain.Hospital;
import com.tcs.hospital.repo.HospitalRepository;
import com.tcs.hospital.service.HospitalService;
@RestController
@ComponentScan({"com.tcs.hospital.service"})
public class HospitalController {
    @Autowired
HospitalService hospitalService;
HospitalRepository hospitalRepository;
    @GetMapping("/hospitals")
    
    private List<Hospital> getAllHospitals() 
    {
        return hospitalService.getAllHospitals();
    }

    /* @GetMapping("/hospitals/{id}")
   /* private Hospital getHospital(@PathVariable("id") int id) 
    {
        return hospitalService.getHospitalById(id);
    }

    @DeleteMapping("/hospitals/{id}")
    private void deleteHospital(@PathVariable("id") int id) 
    {
        hospitalService.delete(id);
    }*/
    @RequestMapping("/webhook")
    private static String hi(){
    	return "Hi";
    }
    

    @PostMapping("/hospitals")
    private int saveHospital(@RequestBody Hospital hospital) 
    {
        hospitalService.saveOrUpdate(hospital);
        return hospital.getId();
        
    }     
}