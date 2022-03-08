package com.vt.javabasics.overloading;

public class AddOverloading {
	
	 static int sum;
	
	public int add(double a, double b) {
		
	  sum= (int) (a+b);
	 return  sum;
	
	}
	
	public int add(int a, int b,int c) {
			sum=0;
		 sum=a+b+c;
		 return sum;
		
		
	}
	
public static void main(String[] args) {
	 AddOverloading al=new AddOverloading();
	 System.out.println( al.add(2,3)+ " " +al.add(2,3,5));
	
}
}
