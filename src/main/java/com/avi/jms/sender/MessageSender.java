/*package com.avi.jms.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	
	private static final Logger logger= LoggerFactory.getLogger(MessageSender.class);
	
	@Autowired
	private JmsTemplate jmsTemplate;	
	
	public void sendMessage(String payLoad) {
		
		logger.info("Preparing to send message...");
		
		jmsTemplate.send(new MessageCreator() {			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				logger.info("Creating Message...");
				TextMessage message = session.createTextMessage(payLoad);
				return message;
			}			
        });
		
		logger.info("Message Sent...");
		
	}

}
*/