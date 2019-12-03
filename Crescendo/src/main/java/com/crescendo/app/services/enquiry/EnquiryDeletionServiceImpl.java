package com.crescendo.app.services.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.components.Enquiry;
import com.crescendo.app.daos.enquiry.EnquiryManagementDAO;
import com.crescendo.app.entities.EnquiryDto;

@Service
public class EnquiryDeletionServiceImpl implements EnquiryDeletionService {

	@Autowired
	private EnquiryManagementDAO dao;

	@Override
	public void execute(Enquiry enquiry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteEnquiry(Enquiry dto) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
