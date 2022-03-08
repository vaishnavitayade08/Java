package com.vt.javabasics.inheritance;

public class EmployeeData {
	
	int empid;
	int sal;
	int exp;
	
	public int sortExp() {
		
		if(exp>1&& sal>=30000) {
			System.out.println("Employee is experienced");
		}
		
		else {
			System.out.println("Employee is fresher ");
		}
		return exp;
	}
}
