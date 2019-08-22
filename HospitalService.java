package com.tcs.hospital.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.hospital.domain.Hospital;
import com.tcs.hospital.repo.HospitalRepository;


@Service
public class HospitalService
{
 
	@Autowired
    HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() 
    {
        List<Hospital> hospitals = new ArrayList<Hospital>();
        hospitalRepository.findAll().forEach(hospital -> hospitals.add(hospital));
        return hospitals;
    }

   /* public Hospital getHospitalById(int id) 
    {
        return hospitalRepository.findById(id).get();
    }
*/
    public void saveOrUpdate(Hospital hospital) {
        hospitalRepository.save(hospital);
    }
        
  /*  public void delete(int id) 
    {
        hospitalRepository.deleteById(id);
    }
}*/
}
