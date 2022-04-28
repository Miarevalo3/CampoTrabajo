package com.example.demo.model;

public class SMS {
	
	User user = new User();
	
	private int phone = user.getPhone(); 
	private String body;
	
	public SMS () {
		
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
