package com.vt.javabasics.overloading;

public class Transformers{
	static double pf=0.9;
	public static double  eff(double i2, int v2) {
		
	 double op= i2*v2*pf;
	 System.out.println("output  is " +op);
	return op;

}

	public static double eff(double i2, int v2, int  pi, int pc ) {
		
		double ip=  (i2*v2*pf)+pi+pc;
		System.out.println("Input is "+ip);
		return ip;

	}
	
	public static void main(String[] args) {
		
		double div= (Transformers.eff(4.5,440) / Transformers.eff(4.3, 440, 750, 1000))*100;
		System.out.println("eff is " +div);
		
		
	}

}

