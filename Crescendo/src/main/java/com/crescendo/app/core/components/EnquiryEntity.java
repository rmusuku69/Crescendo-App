package com.crescendo.app.core.components;

import java.util.Date;
import java.util.Map;

public class EnquiryEntity extends CrescendoEntity{

	
	private Date dateOfBirth;
	private int ageInYears;
	private int numberOfMonths;
	private String gender;
	private String gradeEnquiring;
	private String fathersOccupation;
	private String fathersPlaceOfWork;
	private long fathersPhoneNumber;
	private String mothersName;
	private String mothersOccupation;
	private String mothersPlaceOfWork;
	private long mothersPhoneNumber;
	private String mothersEmailId;
	private Map<Integer, Sibling> siblings;
	private String residentialAddress;
	private long landLineNumber;
	private String challengesAndSpecialities;
	private String expectationFromSchool;
	private Date dateOfEnquiry;
	private Date followUpDate;
	private String admissionStatus;
	private String referredBy;
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public String getGradeEnquiring() {
		return gradeEnquiring;
	}
	public void setGradeEnquiring(String gradeEnquiring) {
		this.gradeEnquiring = gradeEnquiring;
	}
	public String getFathersOccupation() {
		return fathersOccupation;
	}
	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}
	public String getFathersPlaceOfWork() {
		return fathersPlaceOfWork;
	}
	public void setFathersPlaceOfWork(String fathersPlaceOfWork) {
		this.fathersPlaceOfWork = fathersPlaceOfWork;
	}
	public long getFathersPhoneNumber() {
		return fathersPhoneNumber;
	}
	public void setFathersPhoneNumber(long fathersPhoneNumber) {
		this.fathersPhoneNumber = fathersPhoneNumber;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getMothersOccupation() {
		return mothersOccupation;
	}
	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}
	public String getMothersPlaceOfWork() {
		return mothersPlaceOfWork;
	}
	public void setMothersPlaceOfWork(String mothersPlaceOfWork) {
		this.mothersPlaceOfWork = mothersPlaceOfWork;
	}
	public long getMothersPhoneNumber() {
		return mothersPhoneNumber;
	}
	public void setMothersPhoneNumber(long mothersPhoneNumber) {
		this.mothersPhoneNumber = mothersPhoneNumber;
	}
	public String getMothersEmailId() {
		return mothersEmailId;
	}
	public void setMothersEmailId(String mothersEmailId) {
		this.mothersEmailId = mothersEmailId;
	}
	public Map<Integer, Sibling> getSiblings() {
		return siblings;
	}
	public void setSiblings(Map<Integer, Sibling> siblings) {
		this.siblings = siblings;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public long getLandLineNumber() {
		return landLineNumber;
	}
	public void setLandLineNumber(long landLineNumber) {
		this.landLineNumber = landLineNumber;
	}
	public String getChallengesAndSpecialities() {
		return challengesAndSpecialities;
	}
	public void setChallengesAndSpecialities(String challengesAndSpecialities) {
		this.challengesAndSpecialities = challengesAndSpecialities;
	}
	public String getExpectationFromSchool() {
		return expectationFromSchool;
	}
	public void setExpectationFromSchool(String expectationFromSchool) {
		this.expectationFromSchool = expectationFromSchool;
	}
	public Date getDateOfEnquiry() {
		return dateOfEnquiry;
	}
	public void setDateOfEnquiry(Date dateOfEnquiry) {
		this.dateOfEnquiry = dateOfEnquiry;
	}
	public Date getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}
	public String getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	
	
}
