package com.crescendo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crescendo.app.components.Enquiry;
import com.crescendo.app.constants.OperationType;
import com.crescendo.app.services.CrescendoServices;
import com.crescendo.app.services.Module;

@Controller
public class CrescendoAppController {
	@Autowired
	private CrescendoServices crescendoServices;

	@RequestMapping(value = "showEnquiry", method = RequestMethod.GET)
	public String showEnquiry(@ModelAttribute("enquiryModel") Enquiry enquiry) {
		return "Enquiry";
	}
	
	@RequestMapping(value = "saveEnquiry", method = RequestMethod.POST)
	public Enquiry saveEnquiry(@ModelAttribute("enquiryModel") Enquiry enquiry) {
		enquiry.setOperationType(OperationType.CREATE);
		enquiry.setModule(Module.ENQUIRY);
		crescendoServices.execute(enquiry);
		return enquiry;
	}
	
}
