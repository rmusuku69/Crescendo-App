package com.crescendo.app.services.enquiry;

import com.crescendo.app.constants.OperationType;
import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryManagementService {
	
	void manageEnquiry(EnquiryDto enquiry, OperationType operation);

}
