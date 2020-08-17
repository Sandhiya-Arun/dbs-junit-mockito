package com.dbs.business.services;

import java.util.ArrayList;
import java.util.List;

import com.dbs.business.contract.IMessageService;

public class MessageServiceImpl {
	private IMessageService messageService; 
	
	public MessageServiceImpl(IMessageService messageService) {
		this.messageService = messageService; 
	}
	
	public List<String> getMessageFromAuthor(String author) {
		List<String> messages = messageService.getMessages(author);
		
		List<String> filteredMessages = new ArrayList<String>(); 
		
		for(String message: messages) {
			if(message.contains(author)) {
				filteredMessages.add(message); 
			}
		}
		return filteredMessages; 
	}
	
}
