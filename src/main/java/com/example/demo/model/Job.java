package com.example.demo.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Jobs")
public class Job {
	private int LfExperience;
	private Map<String, String> LfSkills;
	private String LfStudies;
	private boolean LfWillingToCapacitate;
	private boolean LfAbleToRelocate;
	private String Urgency;
	private int Salary;
	private int Nvacancies;
	private String OtherAdvantages;
	private boolean OfertCapacitate;
	private boolean OfertLivingPlace;
	
	public Job() {
		
	}

	public Job(int lfExperience, Map<String, String> lfSkills, String lfStudies, boolean lfWillingToCapacitate,
			boolean lfAbleToRelocate, String urgency, int salary, int nvacancies, String otherAdvantages,
			boolean ofertCapacitate, boolean ofertLivingPlace) {
		super();
		LfExperience = lfExperience;
		LfSkills = lfSkills;
		LfStudies = lfStudies;
		LfWillingToCapacitate = lfWillingToCapacitate;
		LfAbleToRelocate = lfAbleToRelocate;
		Urgency = urgency;
		Salary = salary;
		Nvacancies = nvacancies;
		OtherAdvantages = otherAdvantages;
		OfertCapacitate = ofertCapacitate;
		OfertLivingPlace = ofertLivingPlace;
	}

	public int getLfExperience() {
		return LfExperience;
	}

	public void setLfExperience(int lfExperience) {
		LfExperience = lfExperience;
	}

	public Map<String, String> getLfSkills() {
		return LfSkills;
	}

	public void setLfSkills(Map<String, String> lfSkills) {
		LfSkills = lfSkills;
	}

	public String getLfStudies() {
		return LfStudies;
	}

	public void setLfStudies(String lfStudies) {
		LfStudies = lfStudies;
	}

	public boolean isLfWillingToCapacitate() {
		return LfWillingToCapacitate;
	}

	public void setLfWillingToCapacitate(boolean lfWillingToCapacitate) {
		LfWillingToCapacitate = lfWillingToCapacitate;
	}

	public boolean isLfAbleToRelocate() {
		return LfAbleToRelocate;
	}

	public void setLfAbleToRelocate(boolean lfAbleToRelocate) {
		LfAbleToRelocate = lfAbleToRelocate;
	}

	public String getUrgency() {
		return Urgency;
	}

	public void setUrgency(String urgency) {
		Urgency = urgency;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getNvacancies() {
		return Nvacancies;
	}

	public void setNvacancies(int nvacancies) {
		Nvacancies = nvacancies;
	}

	public String getOtherAdvantages() {
		return OtherAdvantages;
	}

	public void setOtherAdvantages(String otherAdvantages) {
		OtherAdvantages = otherAdvantages;
	}

	public boolean isOfertCapacitate() {
		return OfertCapacitate;
	}

	public void setOfertCapacitate(boolean ofertCapacitate) {
		OfertCapacitate = ofertCapacitate;
	}

	public boolean isOfertLivingPlace() {
		return OfertLivingPlace;
	}

	public void setOfertLivingPlace(boolean ofertLivingPlace) {
		OfertLivingPlace = ofertLivingPlace;
	}


}
