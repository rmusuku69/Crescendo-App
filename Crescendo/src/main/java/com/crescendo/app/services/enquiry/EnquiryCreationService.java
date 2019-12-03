package com.crescendo.app.services.enquiry;

import com.crescendo.app.components.Enquiry;

public interface EnquiryCreationService {
	void execute(Enquiry enquiry);

	String createEnquiryId(Enquiry enquiryDto);

	String saveEquiry(Enquiry enquiryDto);
}
