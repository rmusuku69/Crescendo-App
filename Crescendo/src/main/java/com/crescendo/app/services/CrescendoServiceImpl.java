package com.crescendo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.components.CrescendoEntity;
import com.crescendo.app.components.Enquiry;
import com.crescendo.app.components.Login;
import com.crescendo.app.services.enquiry.EnquiryManagementService;
import com.crescendo.app.services.login.LoginManagementService;

@Service
public class CrescendoServiceImpl implements CrescendoServices {
	@Autowired
	private LoginManagementService loginService;
	@Autowired
	private EnquiryManagementService enquiryManagementService;
	
	@Override
	public List<CrescendoEntity> execute(CrescendoEntity entity) {
		switch (entity.getModule()) {
		case ENQUIRY:
			enquiryManagementService.execute((Enquiry) entity);
			break;
		case LOGIN:
			loginService.execute((Login) entity);
		default:
			break;
		}
		return null;
	}
	
	

}
