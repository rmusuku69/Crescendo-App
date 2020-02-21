package com.crescendo.app.services.enquiry;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponse;
import com.crescendo.app.services.CrescendoManagementServices;

@Service("ENQUIRY")
public class EnquiryManagementService implements CrescendoManagementServices {

	@Autowired
	private Map<String, EnquiryOperationsService> enquiryOperations;
	
	@Autowired
	CrescendoResponse crescendoResponse;

	@Override
	public CrescendoResponse execute(CrescendoEntity entity) {
		return enquiryOperations.get(crescendoResponse.getOperationType().toString())
				.execute(entity);
	}
}
