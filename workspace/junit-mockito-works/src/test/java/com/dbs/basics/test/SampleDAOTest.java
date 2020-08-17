package com.dbs.basics.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.dbs.bascis.SampleDAO;

public class SampleDAOTest {

	@Test
	public void sampleInsertPassTest() {
		assertTrue("Sorry we are expecting boolean true", 
				new SampleDAO().insert());
	}

	@Ignore
	@Test
	public void sampleInsertFailTest() {
		
		assertFalse("Sorry we are expecting boolean false", 
				new SampleDAO().insert());
	}
	
	@Test(expected = RuntimeException.class)
	public void sampleInsertExceptionTest() {
		String name="Darsh"; 
		assertEquals("Hi " + name, new SampleDAO().insert1(name));
	}
	
	@Test(timeout = 500)
	public void sampleInsertDelayedTest() {
		String name="Devadutta";
		
		assertEquals(name, new SampleDAO().insert2(name));
	}
	
	
	
	
}















