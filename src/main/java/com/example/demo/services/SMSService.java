package com.example.demo.services;

import com.twilio.rest.api.v2010.account.Message;
import com.example.demo.model.SMS;

public interface SMSService {
	
	public Message sendSMS(SMS sms);
}
