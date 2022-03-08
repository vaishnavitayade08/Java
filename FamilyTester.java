package com.vt.javabasics.encapsulation;

public class FamilyTester {
	
	public static void main(String[] args) {
		
		FamilyDataDTO fd= new FamilyDataDTO("Vaishnavi", 23, "BE");
		String a= fd.toString();
		System.out.println(a);
		
		
	}

}
