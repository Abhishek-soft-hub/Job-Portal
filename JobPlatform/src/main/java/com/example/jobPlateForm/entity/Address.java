package com.example.jobPlateForm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Address {

	@Id
	private int id;
	private String country;
	private String state;
	private String city;
	private String area;
	private int pincode;
}
