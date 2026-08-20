package com.example.jobPlateForm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private String state;
	private String city;
	private String area;
	private int pincode;
	@ManyToOne()
	@JoinColumn(name = "User_Id")
	private User user;
	
}
