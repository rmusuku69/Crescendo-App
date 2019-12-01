package com.crescendo.app.daos.enquiry;

import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryManagementDAO {

	int createEnquiry(EnquiryDto enquiryDto);

	int updateEnquiry(EnquiryDto dto);

	int deleteEnquiry(EnquiryDto dto);
}
