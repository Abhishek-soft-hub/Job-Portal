package com.example.jobPlateForm.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
	
	private int userId;
	private String name;
	private String email;
	private String password;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address>address;
	private String adhharNumber;
	private String panNumber;
	private int experiance;
	

	

}
