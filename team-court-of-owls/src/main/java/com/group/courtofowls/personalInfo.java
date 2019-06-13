package com.group.courtofowls;

public class personalInfo {
	
	private String firstName;
	private String lastName;
	
	private String fullName;
	
	private String DOB;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	

	public boolean validModel() {
		
		return false;
	}

	public String getFullName() {
		fullName= firstName + " " + lastName;
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
