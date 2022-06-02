package com.example.demo.model;

/**
 * clase que permite la creacion de mensajes de texto
 * @author Desktop
 *
 */
public class SMS {
	
	User user = new User();
	
	private String phone = user.getPhone(); 
	private String body;
	
	public SMS () {
		
	}
/**
 * solicita el telefono del usuario
 * @return retorna el telefono
 */
	public String getPhone() {
		return phone;
	}
/**
 * añade el telefono al atributo del sms
 * @param phone
 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
/**
 * solicita el cuerpo del mensaje
 * @return
 */
	public String getBody() {
		return body;
	}
/**
 * añade el cuerpo al atributo del sms
 * @param body
 */
	public void setBody(String body) {
		this.body = body;
	}
	
}
