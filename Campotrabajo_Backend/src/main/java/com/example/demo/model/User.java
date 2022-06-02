package com.example.demo.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
/**
 * clase que describe los usuarios de la aplicación
 * @author Desktop
 *
 */
@Document(collection = "Users")

public class User {
	
	private String Name;
	private String Lastname1;
	private String Lastname2;
	private String Phone;
	private String Rol;
	private String Password;
	private List<Job> JobOfferts;
	private List<Form> MyForm;
	
	public User() {
		
	}
/**
 * constructor de la clase user
 * @param name nombre de usuario		
 * @param lastname1 primer apellido
 * @param lastname2 segundo apellido
 * @param phone telefono
 * @param rol rol que puede ser empleador o trabajador
 * @param password contraseña
 * @param jobOfferts ofertas de trabajo del usuario si tiene roll empleador
 * @param myForm formulario del usuario para aplicar a trabajos si tiene roll trabajador
 */
	public User(String name, String lastname1, String lastname2, String phone, String rol, String password,
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
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
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

