package com.bidlink.mail;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class UnimarketingSendMailWorker implements MessageListener {

	@Override
	public void onMessage(Message msg) {
		// TODO Auto-generated method stub
		try {
			System.out.println ( "consumer "+((TextMessage)msg).getJMSMessageID());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
