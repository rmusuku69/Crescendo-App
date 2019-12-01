package com.crescendo.app.services.enquiry;

import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryModificationService {
	void execute(EnquiryDto dto);

	int updateEnquiry(EnquiryDto enquiryDto);
}
