package com.crescendo.app.services.enquiry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crescendo.app.constants.OperationType;
import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponce;
import com.crescendo.app.services.CrescendoManagementServices;

@Service
public class EnquiryManagementService implements CrescendoManagementServices {

	@Autowired
	private Map<OperationType, EnquiryOperationsService> enquiryOperations;

	@Override
	public CrescendoResponce execute(List<CrescendoEntity> entities) {
		CrescendoResponce crescendoResponce = new CrescendoResponce();
		List<CrescendoEntity> crescendoEntities = new ArrayList<CrescendoEntity>();
		for (CrescendoEntity crescendoEntity : entities) {
			CrescendoEntity crescendoEntityResponce = enquiryOperations.get(crescendoEntity.getOperationType())
					.execute(crescendoEntity);
			crescendoEntities.add(crescendoEntityResponce);
		}
		crescendoResponce.setViewName("");
		crescendoResponce.setCrescendoEntities(crescendoEntities);
		return crescendoResponce;
	}
}
