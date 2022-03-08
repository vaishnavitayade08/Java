package com.vt.javabasics.overloading;

public class Bike {
	public float speed(int dist, int time) {
		
		float speed1=dist/time;
		System.out.println(" Speed1 is "+speed1+"km/hr");
		return speed1;
		
	}
	
	
	public float speed(float dist, int time) {
		int speed1=(int)dist/ time;
		System.out.println(" Speed1 is "+speed1+ "km/hr");
		return (float)speed1;
	}

	public static void main(String[] args) {
		Bike obj= new Bike();
		obj.speed(100, 2);
		obj.speed(150,3);
	}
}

 