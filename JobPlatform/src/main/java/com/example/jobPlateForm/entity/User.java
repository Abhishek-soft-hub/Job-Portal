package com.example.jobPlateForm.entity;

import java.util.List;

import com.example.jobPlateForm.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(unique = true, nullable = false)
	private String email;
	private long mobileNumber;
	@Column(nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;

	private String first_Name;
	private String middle_Name;
	private String last_Name;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> address;
	private int experiance;
	@ElementCollection
	private List<String> skills;

}
