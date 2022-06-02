package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SMS;
import com.example.demo.services.SMSService;
import com.twilio.rest.api.v2010.account.Message;
/**
 * SMSController contiene los métodos del controllador de SMS
 * @author Miller Luis
 *
 */
@RestController
public class SMSController {
	@Autowired
	private SMSService smsService;
/**
 * crea un nuevo sms
 * @param sms instancia de la clase sms paracrear un nuevo sms
 * @return retorna el sms creado al servicio sms
 */
	@PostMapping("/api/v1/SMS")
	public Message sendSMS(@RequestBody SMS sms) {
		return smsService.sendSMS(sms);
	}
}
