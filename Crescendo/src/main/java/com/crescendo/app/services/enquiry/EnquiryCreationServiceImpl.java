package com.crescendo.app.services.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.daos.enquiry.EnquiryManagementDAO;
import com.crescendo.app.entities.EnquiryDto;

@Service
public class EnquiryCreationServiceImpl implements EnquiryCreationService {

	@Autowired
	private EnquiryManagementDAO dao;

	@Override
	public int saveEquiry(EnquiryDto enquiryDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createEnquiryId(EnquiryDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(EnquiryDto enquiryDto) {
		// TODO Auto-generated method stub

	}

}
