package com.dbs.basics.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeDAOTestRunner {
	public static void main(String[] args) {
		// ctrl +2 + l 
		Result result = JUnitCore.runClasses(EmployeeDAOTest.class); 

		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful()
					?"Test Cases Passed":"Sorry some cases failed"); 
		
	}
}
