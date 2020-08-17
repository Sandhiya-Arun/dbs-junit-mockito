package com.dbs.busines.services.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbs.business.contract.IMessageService;
import com.dbs.business.services.MessageServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class MessageServiceImplMockTestAnnotation {
	@Mock
	IMessageService service; 
	
	@InjectMocks
	MessageServiceImpl messageServiceImpl; 
	
	@Test
	public void messageServiceImplMockTest_mockTest_withAnnotation1() {
		 List<String> asList = Arrays.asList
				("book from manaswi on java", 
				"book from manaswi on c++", 
				"book from pritesh on .net", 
				"book from manaswi on python"); 
		
		when(service.getMessages("manaswi")).thenReturn(asList); 
		
		List<String> list = messageServiceImpl.getMessageFromAuthor("manaswi");
		assertEquals(3, list.size());
	}
	
	@Test
	public void messageServiceImplMockTest_mockTest_withAnnotation2() {
		 List<String> asList = Arrays.asList
				("book from manaswi on java", 
				"book from manaswi on c++", 
				"book from pritesh on .net", 
				"book from manaswi on python"); 
		when(service.getMessages("pritesh")).thenReturn(asList); 
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl(service); 

		List<String> list = messageServiceImpl.getMessageFromAuthor("pritesh");
		assertEquals(1, list.size());
	}

}
