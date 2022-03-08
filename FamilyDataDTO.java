package com.vt.javabasics.encapsulation;

public class FamilyDataDTO {
	
	private String name;
	private int age;
	private String edu;
	
	
	public FamilyDataDTO(String name, int age, String edu) {
		super();
		this.name = name;
		this.age = age;
		this.edu = edu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	@Override
	public String toString() {
		return "FamilyDataDTO [name=" + name + ", age=" + age + ", edu=" + edu + "]";
	}
	
	


}
