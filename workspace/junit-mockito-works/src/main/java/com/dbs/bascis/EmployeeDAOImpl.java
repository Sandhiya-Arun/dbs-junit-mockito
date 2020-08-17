package com.dbs.bascis;

// dummy impl
// we will do this with jUnit (5-> 4) 
public class EmployeeDAOImpl {
	public static void main(String[] args) {
		
		EmployeeDAO dao = new EmployeeDAO(); 
		
		String emp1 = "Soumya";
		String emp2 = "Nabha"; 
		
		dao.insertEmployee(emp1); 
		dao.insertEmployee(emp2); 
		
		String expectedEmp1 = "Hi " + emp1; 
		String expectedEmp2 = "Hi " + emp2; 
		
		System.out.println(dao.getEmployee(emp1));
		
		if(expectedEmp1.equals(dao.getEmployee(emp1))) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
	}
}
