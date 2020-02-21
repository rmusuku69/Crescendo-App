package com.crescendo.app.core.components;

public class Sibling {

	private int siblingNumber;
	private int ageInYears;
	private int numberOfMonths;
	private String gender;
	
	
	
	@Override
	public String toString() {
		return "Sibling [siblingNumber=" + siblingNumber + ", ageInYears=" + ageInYears + ", numberOfMonths="
				+ numberOfMonths + ", gender=" + gender + "]";
	}
	public int getSiblingNumber() {
		return siblingNumber;
	}
	public void setSiblingNumber(int siblingNumber) {
		this.siblingNumber = siblingNumber;
	}
	public int getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
