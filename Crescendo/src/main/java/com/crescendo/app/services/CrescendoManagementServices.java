package com.crescendo.app.services;

import java.util.List;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponse;

public interface CrescendoManagementServices {
	CrescendoResponse execute(CrescendoEntity entity);
}
