package com.school.info;

import java.util.Scanner;

import com.school.info.dao.ClassAdao;
import com.school.info.dto.ClassAdto;

public class SchoolTester {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int strength=sc.nextInt();
		String str=sc.next();
		
		ClassAdto dto=new ClassAdto(id,strength,str);
		ClassAdao dao= new ClassAdao();
		System.out.println(dao.saveClass(dto));
	}

}
