package com.crescendo.app.daos.enquiry;

import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.entities.EnquiryDto;

public interface EnquiryManagementDAO {

	CrescendoEntity updateEnquiry(EnquiryDto dto);

	CrescendoEntity deleteEnquiry(EnquiryDto dto);

	CrescendoEntity saveEnquiry(EnquiryDto enquiry);
}
