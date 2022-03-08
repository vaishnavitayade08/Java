package com.vt.javabasics.inheritance;

public class Maruti extends Car {
	
	public int speed() {
		
		return 7;	
}

public static void main(String[] args) {
	
	 Car obj = new Maruti();
		System.out.println(obj.speed());		
}
}