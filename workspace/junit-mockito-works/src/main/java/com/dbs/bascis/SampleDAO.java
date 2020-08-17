package com.dbs.bascis;

public class SampleDAO {
	public boolean insert() {
		return true;
	}

	public String insert1(String name) {
		if (name.equals("Amey")) {
			return "Hi " + name;
		} else {
			throw new RuntimeException("Name Not Valid");
		}
	}
	
	
	
	public String insert2(String name) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return name; 
	}
}
