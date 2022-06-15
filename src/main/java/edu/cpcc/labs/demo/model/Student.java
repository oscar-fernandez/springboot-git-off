package edu.cpcc.labs.demo.model;

public class Student {
	private String name;
	private String major;
	private int credits;
	
	public Student() {
		this.setName("None");
		this.setMajor("None");
		this.setCredits(0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
}
