package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.SMS;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


@Service
public class SMSServiceTwilio implements SMSService {
	
	// Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACa57b0f1c66c088091e627d3d2a037812";
    public static final String AUTH_TOKEN = "eae1397a2205f6edfd9e15f92146e0ab";

    @Override
    public Message sendSMS(SMS sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(sms.getPhone()),
                new com.twilio.type.PhoneNumber("+18596949603"),//The Twilio phone number
                sms.getBody())
           .create();

        return message;
    }
}
