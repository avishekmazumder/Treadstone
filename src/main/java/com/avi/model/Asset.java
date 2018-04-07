package com.avi.model;

import java.util.List;

public class Asset {
	
	private String name;
	private String id;
	private String gender;
	private String postedCountry;
	private List<String> skills;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostedCountry() {
		return postedCountry;
	}
	public void setPostedCountry(String postedCountry) {
		this.postedCountry = postedCountry;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	

}
