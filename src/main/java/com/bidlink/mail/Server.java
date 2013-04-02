package com.bidlink.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bidlink.mail.service.SendMailService;

/**
 * mail server
 *
 */
public class Server 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mail-service-context.xml");
//    	applicationContext
    	
    	SendMailService sendMailService =  (SendMailService) applicationContext.getBean("sendmail");
    	for (int i=0; i< 1000; i++){
    		sendMailService.sendMail(null);
        		
    	}
    	
    }
}
