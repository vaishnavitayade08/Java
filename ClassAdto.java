package com.school.info.dto;

public class ClassAdto {
	
	private  int id;
	private int strength;
	private String mentor;
	
	public ClassAdto(int id, int strength, String mentor){
		
		super();
		this.id=id;
		this.strength=strength;
		this.mentor=mentor;
	}

	public int getId() {
		return id;
	}

	public int getStrength() {
		return strength;
	}

	public String getMentor() {
		return mentor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	
	
}

 
