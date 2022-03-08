package com.vt.javabasics.inheritance;

public class TestInheritance  {
	
public static void main(String[] args) {
	
	Emp1 ab= new Emp1();
		ab.empid= 14;
		ab.sal= 20000;
		ab.exp= 1;
		ab.data();
		ab.sortExp();
		
	Emp2 bc = new Emp2();
		bc.empid= 15;
		bc.sal= 30000;
		bc.exp= 2;
		bc.data();
		bc.sortExp();
		
	Emp3 cd = new Emp3();
		cd.empid= 16;
		cd.sal= 40000;
		cd.exp= 3;
		cd.data();
		cd.sortExp();
}
}
