package com.crescendo.app.services.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.Enquiry;
import com.crescendo.app.daos.enquiry.EnquiryManagementDAO;

@Service
public class EnquiryDeletionService implements EnquiryOperationsService {

	@Autowired
	private EnquiryManagementDAO dao;

	public int deleteEnquiry(Enquiry dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CrescendoEntity execute(CrescendoEntity crescendoEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
