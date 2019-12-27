package com.crescendo.app.services.enquiry;

import java.util.List;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.controllers.CrescendoAppController;

public class EnquiryShowService implements EnquiryOperationsService {

	@Override
	public List<CrescendoEntity> execute(CrescendoEntity crescendoEntity) {
		return show(crescendoEntity);
	}

	public List<CrescendoEntity> show(CrescendoEntity crescendoEntity) {
		CrescendoAppController.setViewName("EnquiryForm");
		return null;
	}

}
