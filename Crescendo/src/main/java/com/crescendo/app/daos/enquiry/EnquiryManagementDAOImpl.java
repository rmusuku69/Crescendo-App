package com.crescendo.app.daos.enquiry;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.entities.EnquiryDto;

@Repository
public class EnquiryManagementDAOImpl implements EnquiryManagementDAO {

	private SessionFactory sessionFactory;

	@Override
	public CrescendoEntity updateEnquiry(EnquiryDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CrescendoEntity deleteEnquiry(EnquiryDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CrescendoEntity saveEnquiry(EnquiryDto enquiry) {
		// TODO Auto-generated method stub
		return null;
	}

}
