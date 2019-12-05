package com.crescendo.app.services;

import java.util.List;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponce;

public interface CrescendoManagementServices {
	CrescendoResponce execute(List<CrescendoEntity> entities);
}
