package com.example.demo.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")

public class User {
	
	private String Name;
	private String Lastname1;
	private String Lastname2;
	private int Phone;
	private String Rol;
	private String Password;
	private List<Job> JobOfferts;
	private List<Form> MyForm;
	public User() {
		
	}
	public User(String name, String lastname1, String lastname2, int phone, String rol, String password,
			List<Job> jobOfferts, List<Form> myForm) {
		super();
		Name = name;
		Lastname1 = lastname1;
		Lastname2 = lastname2;
		Phone = phone;
		Rol = rol;
		Password = password;
		JobOfferts = jobOfferts;
		MyForm = myForm;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastname1() {
		return Lastname1;
	}
	public void setLastname1(String lastname1) {
		Lastname1 = lastname1;
	}
	public String getLastname2() {
		return Lastname2;
	}
	public void setLastname2(String lastname2) {
		Lastname2 = lastname2;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public List<Job> getJobOfferts() {
		return JobOfferts;
	}
	public void setJobOfferts(List<Job> jobOfferts) {
		JobOfferts = jobOfferts;
	}
	public List<Form> getMyForm() {
		return MyForm;
	}
	public void setMyForm(List<Form> myForm) {
		MyForm = myForm;
	}


	
}

