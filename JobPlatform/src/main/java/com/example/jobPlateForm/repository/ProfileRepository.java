package com.example.jobPlateForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobPlateForm.entity.ProfileUser;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileUser,Integer> {

}
