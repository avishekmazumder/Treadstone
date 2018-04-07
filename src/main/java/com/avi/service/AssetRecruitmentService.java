package com.avi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AssetRecruitmentService {
	
	
	public List<String> populateCountryList() {
		
		return Arrays.asList("Russia","China","India","Iran","Iraq","Italy");
	}

	public List<String> populateSkillsList() {
		// TODO Auto-generated method stub
		return Arrays.asList("Stealth","Martial Arts","High speed Driving","Accurate Shot","Fast Learner");
	}

}
