package com.crescendo.app.services.enquiry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponse;
import com.crescendo.app.core.components.Enquiry;
import com.crescendo.app.core.controllers.CrescendoAppController;
import com.crescendo.app.core.util.CrescendoUtil;
import com.crescendo.app.daos.enquiry.EnquiryManagementDAO;
import com.crescendo.app.entities.EnquiryDto;

@Service
public class EnquiryCreationService implements EnquiryOperationsService {

	@Autowired
	CrescendoResponse crescendoResponse;
	@Autowired
	private EnquiryManagementDAO dao;

	public String createEnquiryId(Enquiry enquiry) {
		// TODO Auto-generated method stub
		return null;
	}

	public CrescendoEntity saveEquiry(EnquiryDto enquiry) {
		return dao.saveEnquiry(enquiry);
	}

	@Override
	public CrescendoResponse execute(CrescendoEntity crescendoEntity) {
		boolean isValid = validateCrescendoEntity();
		List<CrescendoEntity> crescendoEntities = new ArrayList<CrescendoEntity>();
		if(isValid){
			Enquiry enquiry = (Enquiry) crescendoEntity;
			String enquiryId = createEnquiryId((Enquiry) crescendoEntity);
			EnquiryDto enquiryDto = (EnquiryDto) CrescendoUtil.convert(enquiry, EnquiryDto.class);
			enquiryDto.setEnquiryId(enquiryId);
			CrescendoEntity entity = saveEquiry(enquiryDto);
			crescendoEntities.add(entity);
			crescendoResponse.setViewName("EnquirySuccess");
			crescendoResponse.setCrescendoEntities(crescendoEntities);
		} else{
			crescendoEntities = null;
			crescendoResponse.setViewName("EnquiryForm");
		}
		return crescendoResponse;
		
	}

	private boolean validateCrescendoEntity() {
		// TODO Auto-generated method stub
		return false;
	}
}
