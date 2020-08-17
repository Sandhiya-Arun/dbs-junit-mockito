package com.dbs.basics.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dbs.bascis.EmployeeDAO;

public class EmployeeDAOTest {

	private EmployeeDAO dao;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before class invoked");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After Class Invoked..");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before is invoked... ");
		dao = new EmployeeDAO(); 
	}
	
	@After
	public void tearDown() {
		System.out.println("After is invoked");
	}
	
	@Test
	public void insertEmployeePassTest() {
		String empName = "Soumya"; 
		assertEquals(true, dao.insertEmployee(empName));
	}
	
	@Test
	public void insertEmployeeFailTest() {
		String empName = "Soumya"; 
		assertEquals(false, dao.insertEmployee(empName));
	}
	 
	
	@Test
	public void getEmployeeTest() {
		// String expected ="Hi " + empName; 
	}
	
	public void test2() {
		System.out.println("Test2");
	}
}
