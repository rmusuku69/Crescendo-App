package com.crescendo.app.core.components;

import com.crescendo.app.constants.OperationType;

public class CrescendoEntity {

	private String studentName;
	private String fathersName;
	private String fathersEmailId;
	private String branchName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
