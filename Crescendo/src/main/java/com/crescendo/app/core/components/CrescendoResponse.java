package com.crescendo.app.core.components;

import java.util.List;

public class CrescendoResponse {
	private List<CrescendoEntity> crescendoEntities;
	private String viewName;
	private String moduleName;
	private String operationType;

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public List<CrescendoEntity> getCrescendoEntities() {
		return crescendoEntities;
	}

	public void setCrescendoEntities(List<CrescendoEntity> crescendoEntities) {
		this.crescendoEntities = crescendoEntities;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = this.getOperationType().toLowerCase() + this.getModuleName().toLowerCase();
	}

}
