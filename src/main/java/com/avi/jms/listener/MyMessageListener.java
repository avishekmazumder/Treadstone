/*package com.avi.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMessageListener implements MessageListener{
	
	private static final Logger logger = LoggerFactory.getLogger(MyMessageListener.class);

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		
		TextMessage message1=(TextMessage)message;  
        try{
        	System.out.println(message1.getText());
        	logger.debug("Recieved Message"+message1.getText());
           
        } catch (Exception e) { 
        	logger.error("Exception while listening to JMS", e); 
        }  
    }  
		

}
*/