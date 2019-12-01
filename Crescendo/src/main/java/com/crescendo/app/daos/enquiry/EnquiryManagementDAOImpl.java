package com.crescendo.app.daos.enquiry;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crescendo.app.entities.EnquiryDto;

@Repository
public class EnquiryManagementDAOImpl implements EnquiryManagementDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int createEnquiry(EnquiryDto enquiryDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEnquiry(EnquiryDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEnquiry(EnquiryDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
