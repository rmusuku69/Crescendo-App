package com.crescendo.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.services.enquiry.EnquiryManagementService;

@Service
public class CrescendoServiceImpl implements CrescendoServices {
	@Autowired
	private LoginService loginService;
	@Autowired
	private EnquiryManagementService enquiryManagementService;

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
