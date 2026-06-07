package com.example.jobPlateForm.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ProfileUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	@OneToOne
	@JoinColumn(name = "user_Id")
	private User user;
	@OneToMany
	private List<Address> address;
	private int experiance;
	@ElementCollection
	private List<String> skills;

}
