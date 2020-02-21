package com.crescendo.app.services.enquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponse;
import com.crescendo.app.core.controllers.CrescendoAppController;

public class EnquiryShowService implements EnquiryOperationsService {

	@Autowired
	CrescendoResponse crescendoResponse;
	@Override
	public CrescendoResponse execute(CrescendoEntity crescendoEntity) {
		return show(crescendoEntity);
	}

	public CrescendoResponse show(CrescendoEntity crescendoEntity) {
		crescendoResponse.setViewName("EnquiryForm");
		return null;
	}

}
