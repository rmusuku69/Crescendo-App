package com.crescendo.app.services.enquiry;

import com.crescendo.app.components.Enquiry;

public interface EnquiryModificationService {
	void execute(Enquiry enquiry);

	int updateEnquiry(Enquiry enquiryDto);
}
