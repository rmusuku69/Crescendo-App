package com.crescendo.app.services.enquiry;

import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryCreationService {
	void execute(EnquiryDto enquiryDto);

	String createEnquiryId(EnquiryDto enquiryDto);

	int saveEquiry(EnquiryDto enquiryDto);
}
