package com.crescendo.app.core.components;

import java.util.List;

import com.crescendo.app.core.components.CrescendoEntity;

public class CrescendoResponce {
	private List<CrescendoEntity> crescendoEntities;
	private String viewName;

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
		this.viewName = viewName;
	}

}
