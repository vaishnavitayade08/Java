package com.school.info.dao;

import com.school.info.dto.ClassAdto;

public class ClassAdao {

	 public ClassAdto[] arr= new ClassAdto[4];
	 
	 int index;
	 public boolean saveClass(ClassAdto dto) {
		 
		 boolean isSaved=false;
		 
		 if(dto!=null) {
			 
			 arr[index++]=dto;
			 isSaved=true;
			return isSaved;
		 }
		 return isSaved;
		 
	 }
}
