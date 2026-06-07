package com.example.jobPlateForm.service;

import com.example.jobPlateForm.entity.ProfileUser;

public interface ProfileService {
	
	public void createProfile(ProfileUser profileUser);
	public void deleteProfile(int id);
	public void updateProfile(int id, ProfileUser profileUser);
	

}
