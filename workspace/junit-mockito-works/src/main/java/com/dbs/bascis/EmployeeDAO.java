package com.dbs.bascis;

import java.util.HashMap;
import java.util.Map;

// CRUD 
public class EmployeeDAO {
	
	static Map<String, String> employees; 
	
	static {
		employees = new HashMap<String, String>(); 
	}
	
	public boolean insertEmployee(String empName) {
		
		if(empName.length() <5) {
			return false; 
		}
		
		// simulate now to insert the record 
		employees.put(empName, empName); 
		return true; 
	}
	
	// Hi Sandhiya 
	public String getEmployee(String empName) {
		return "Hi " + employees.get(empName) ; 
	}
}
