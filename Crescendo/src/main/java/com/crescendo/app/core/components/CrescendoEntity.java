package com.crescendo.app.core.components;

public class CrescendoEntity {

	private String firstName;
	private String lastName;
	private String fathersEmailId;
	private String branchName;
	private String admissionNumber;
	
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

	private String fathersName;
	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getFathersEmailId() {
		return fathersEmailId;
	}

	public void setFathersEmailId(String fathersEmailId) {
		this.fathersEmailId = fathersEmailId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
