package com.crescendo.app.services.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.app.components.Enquiry;

@Service
public class EnquiryManagementServiceImpl implements EnquiryManagementService {
	@Autowired
	private EnquiryCreationService createService;
	@Autowired
	private EnquiryModificationService modifyService;
	@Autowired
	private EnquiryDeletionService deleteService;

	@Override
	public void execute(Enquiry enquiry) {

		switch (enquiry.getOperationType()) {
		case CREATE:
			createService.execute(enquiry);
			break;
		case MODIFY:
			modifyService.execute(enquiry);
			break;
		case DELETE:
			deleteService.execute(enquiry);
			break;
		default:
			break;
		}
	}
}
