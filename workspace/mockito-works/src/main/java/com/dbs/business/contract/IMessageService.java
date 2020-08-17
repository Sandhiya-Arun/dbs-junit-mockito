package com.dbs.business.contract;

import java.util.List;

// all the methods to go here 
public interface IMessageService {
	public List<String> getMessages(String author); 
	
	// this is for you to implement 
//	public void deleteMessageByAuthor(String author); 
	
}
