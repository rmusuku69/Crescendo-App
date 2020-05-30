package com.crescendo.app.core.components;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="enquiries", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")})
public class EnquiryEntity extends CrescendoEntity{

	@Column(name="ENQUIRY_ID", unique = true, nullable = false)
	private String enquiryId;
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column(name="AGE_IN_YEARS")
	private int ageInYears;
	@Column(name="NUMBER_OF_MONTHS")
	private int numberOfMonths;
	@Column(name="GENDER")
	private String gender;
	@Column(name="GRADE_ENQUIRING")
	private String gradeEnquiring;
	@Column(name="FATHERS_OCCUPATION")
	private String fathersOccupation;
	@Column(name="FATHERS_PLACE_OF_WORK")
	private String fathersPlaceOfWork;
	@Column(name="FATHERS_PHONE_NUMBER")
	private long fathersPhoneNumber;
	@Column(name="FATHERS_EMAIL_ID")
	private String fathersEmailId;
	@Column(name="MOTHERS_NAME")
	private String mothersName;
	@Column(name="MOTHERS_OCCUPATION")
	private String mothersOccupation;
	@Column(name="MOTHERS_PLACE_OF_WORK")
	private String mothersPlaceOfWork;
	@Column(name="MOTHERS_PHONE_NUMBER")
	private long mothersPhoneNumber;
	@Column(name="MOTHERS_EMAIL_ID")
	private String mothersEmailId;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="EMPLOYEE_ID")
	private Set<Sibling> siblings;
	@JoinColumn(name="RESIDENTIAL_ADDRESS")
	private String residentialAddress;
	@JoinColumn(name="LANDLINE_NUMBER")
	private long landLineNumber;
	@JoinColumn(name="CHALLENGES_SPECIALITIES")
	private String challengesAndSpecialities;
	@JoinColumn(name="EXPECTATION_FROM_SCHOOL")
	private String expectationFromSchool;
	@JoinColumn(name="DATE_OF_ENQUIRY")
	private Date dateOfEnquiry;
	@JoinColumn(name="FOLLOWUP_DATE")
	private Date followUpDate;
	@JoinColumn(name="ADMISSION_STATUS")
	private String admissionStatus;
	@JoinColumn(name="REFERRED_BY")
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
	public Set<Sibling> getSiblings() {
		return siblings;
	}
	public void setSiblings(Set<Sibling> siblings) {
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
	public String getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}
	
}
