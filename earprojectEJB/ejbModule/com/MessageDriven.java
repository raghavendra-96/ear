package com;

import javax.ejb.ActivationConfigProperty;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: MessageDriven
 */
@javax.ejb.MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "zensar_queue"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "zensar_queue")
public class MessageDriven implements MessageListener {

    /**
     * Default constructor. 
     */
    public MessageDriven() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        // TODO Auto-generated method stub
    	TextMessage tt=(TextMessage)message;
    	try{
    		
    
        System.out.println("Reading message:"+tt.getText());
    }catch(JMSException e){
    	e.printStackTrace();
    }

}}
