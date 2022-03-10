package com.vt.javabasics.constructor_overloading;

public class Employee {
	
	String name;
	int salary;
	
	Employee( String name){
		this.name= name;
		System.out.println("Name of employee is:"+name);
	}
	
	Employee(  int salary){
		this.salary=salary;
		System.out.println(" Salary is: "+ salary);
	}
	
	}
	
