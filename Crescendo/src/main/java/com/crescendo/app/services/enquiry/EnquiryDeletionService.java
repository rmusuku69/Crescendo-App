package com.crescendo.app.services.enquiry;

import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryDeletionService {
	void execute(EnquiryDto dto);

	int deleteEnquiry(EnquiryDto dto);
}
