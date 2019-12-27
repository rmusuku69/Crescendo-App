package com.crescendo.app.services;

import java.util.List;

import com.crescendo.app.core.components.CrescendoEntity;

public interface CrescendoManagementServices {
	List<CrescendoEntity> execute(CrescendoEntity entity);
}
