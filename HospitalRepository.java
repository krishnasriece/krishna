package com.tcs.hospital.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.hospital.domain.Hospital;

public interface HospitalRepository extends CrudRepository<Hospital, Integer> {
}
