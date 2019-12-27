package com.crescendo.app.constants;

public enum OperationType {

	CREATE, MODIFY, DELETE, SHOW;

	private String operationType;

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
