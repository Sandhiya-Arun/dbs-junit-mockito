package com.dbs.busines.services.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.dbs.business.contract.IMessageService;
import com.dbs.business.data.api.MessageServiceStub;
import com.dbs.business.services.MessageServiceImpl;

class MessageServiceImplStubTest {

	@Test
	@DisplayName("sample test to test with stub data hard coded")
	void testMessageServiceImplStubTest() {
		 IMessageService service = 
				 	new MessageServiceStub(); 
		 
		 
		 MessageServiceImpl messageServiceImpl = 
				new MessageServiceImpl(service); 
		 
		 List<String> list = messageServiceImpl.getMessageFromAuthor("manaswi"); 
		 
		 assertEquals(3, list.size());
		 
	}

}






