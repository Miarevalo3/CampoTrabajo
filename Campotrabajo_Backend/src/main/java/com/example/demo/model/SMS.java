package com.example.demo.model;

public class SMS {
	
	User user = new User();
	
	private String phone = user.getPhone(); 
	private String body;
	
	public SMS () {
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
