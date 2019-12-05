package com.crescendo.app.core.components;

import java.util.List;

import com.crescendo.app.constants.Module;
import com.crescendo.app.core.components.CrescendoEntity;

public class CrescendoRequest {
	private List<CrescendoEntity> crescendoEntities;
	private Module module;

	public List<CrescendoEntity> getCrescendoEntities() {
		return crescendoEntities;
	}

	public void setCrescendoEntities(List<CrescendoEntity> crescendoEntities) {
		this.crescendoEntities = crescendoEntities;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
