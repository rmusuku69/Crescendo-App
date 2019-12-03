package com.crescendo.app.services.enquiry;

import com.crescendo.app.components.Enquiry;

public interface EnquiryDeletionService {
	void execute(Enquiry enquiry);

	int deleteEnquiry(Enquiry dto);
}
