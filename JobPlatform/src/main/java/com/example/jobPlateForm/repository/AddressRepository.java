package com.example.jobPlateForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobPlateForm.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
