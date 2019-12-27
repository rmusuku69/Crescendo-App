package com.crescendo.app.services.enquiry;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.services.CrescendoManagementServices;

@Service("ENQUIRY")
public class EnquiryManagementService implements CrescendoManagementServices {

	@Autowired
	private Map<String, EnquiryOperationsService> enquiryOperations;

	@Override
	public List<CrescendoEntity> execute(CrescendoEntity entity) {
		return enquiryOperations.get(entity.getOperationType().toString())
				.execute(entity);
	}
}
