package com.dbs.busines.services.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import com.dbs.business.contract.IMessageService;
import com.dbs.business.services.MessageServiceImpl;

class MessageServiceImplMockTest {

	@Test
	void messageServiceImplMockTest_mockTest() {
		IMessageService service =  mock(IMessageService.class); 
		
		
		List<String> asList = Arrays.asList
				("book from manaswi on java", 
				"book from manaswi on c++", 
				"book from pritesh on .net", 
				"book from manaswi on python"); 
		
		// BDD -> Given When Then 
		 when(service.getMessages("manaswi")).thenReturn(asList); 
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl(service); 
		List<String> list = messageServiceImpl.getMessageFromAuthor("manaswi");
		
		assertEquals(3, list.size());
		
	}

}
