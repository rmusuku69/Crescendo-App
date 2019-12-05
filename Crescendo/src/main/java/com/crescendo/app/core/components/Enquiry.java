package com.crescendo.app.core.components;

import java.util.List;

import com.crescendo.app.constants.OperationType;

public class Enquiry extends CrescendoEntity {
	private String enquiryId;
	private List<FollowUp> followUps;
	private OperationType operationType;

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}

	public List<FollowUp> getFollowUps() {
		return followUps;
	}

	public void setFollowUps(List<FollowUp> followUps) {
		this.followUps = followUps;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

}
