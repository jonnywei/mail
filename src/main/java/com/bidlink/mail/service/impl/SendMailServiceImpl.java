package com.bidlink.mail.service.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.bidlink.mail.service.SendMailService;

public class SendMailServiceImpl implements SendMailService{

	@Autowired
	private JmsTemplate jmsTemplate;
	public void sendMail (String mail){
		long start = System.currentTimeMillis();
		jmsTemplate.send(new MessageCreator(){

			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				TextMessage tmsg = session.createTextMessage("api test");
				return tmsg;
			}
			
		});
		System.out.println(System.currentTimeMillis() - start );
//		System.out.println("send mail");
	}
}
