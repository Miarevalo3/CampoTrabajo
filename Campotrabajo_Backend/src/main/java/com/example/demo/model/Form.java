package com.example.demo.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;


public class Form {
	
	private int Experience;
	private Map<String, String> Skills; 
	private String Studies;
	private boolean WillingToCapacitate;
	private boolean AbleToRelocate;
	
	public Form() {
		
	}

	public Form(int experience, Map<String, String> skills, String studies, boolean willingToCapacitate,
			boolean ableToRelocate) {
		super();
		Experience = experience;
		Skills = skills;
		Studies = studies;
		WillingToCapacitate = willingToCapacitate;
		AbleToRelocate = ableToRelocate;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	public Map<String, String> getSkills() {
		return Skills;
	}

	public void setSkills(Map<String, String> skills) {
		Skills = skills;
	}

	public String getStudies() {
		return Studies;
	}

	public void setStudies(String studies) {
		Studies = studies;
	}

	public boolean isWillingToCapacitate() {
		return WillingToCapacitate;
	}

	public void setWillingToCapacitate(boolean willingToCapacitate) {
		WillingToCapacitate = willingToCapacitate;
	}

	public boolean isAbleToRelocate() {
		return AbleToRelocate;
	}

	public void setAbleToRelocate(boolean ableToRelocate) {
		AbleToRelocate = ableToRelocate;
	}


}
