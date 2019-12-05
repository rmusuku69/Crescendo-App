package com.crescendo.app.services.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.Enquiry;
import com.crescendo.app.core.util.CrescendoUtil;
import com.crescendo.app.daos.enquiry.EnquiryManagementDAO;
import com.crescendo.app.entities.EnquiryDto;

@Service
public class EnquiryCreationService implements EnquiryOperationsService {

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
	public CrescendoEntity execute(CrescendoEntity crescendoEntity) {
		Enquiry enquiry = (Enquiry) crescendoEntity;
		String enquiryId = createEnquiryId((Enquiry) crescendoEntity);
		EnquiryDto enquiryDto = (EnquiryDto) CrescendoUtil.convert(enquiry, EnquiryDto.class);
		enquiryDto.setEnquiryId(enquiryId);
		return saveEquiry(enquiryDto);
	}
}
