package com.dbs.business.data.api;

import java.util.Arrays;
import java.util.List;

import com.dbs.business.contract.IMessageService;

// who has the data 
public class MessageServiceStub implements IMessageService {

	public List<String> getMessages(String author) {
		List<String> asList = Arrays.asList
				("book from manaswi on java", 
				"book from manaswi on c++", 
				"book from pritesh on .net", 
				"book from manaswi on python"); 
		
		return asList; 
	}
}
