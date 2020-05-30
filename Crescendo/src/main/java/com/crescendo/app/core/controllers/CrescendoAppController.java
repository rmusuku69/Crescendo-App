package com.crescendo.app.core.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crescendo.app.constants.OperationType;
import com.crescendo.app.core.components.CrescendoEntity;
import com.crescendo.app.core.components.CrescendoResponse;
import com.crescendo.app.services.CrescendoManagementServices;

@Controller
@RequestMapping("/")
public class CrescendoAppController {
	@Autowired
	private Map<String, CrescendoManagementServices> crescendoServices;
	@Autowired
	private CrescendoResponse crescendoResponse;
	

	// sample request -- localhost:8080/crescendo/ENQUIRY/SHOW
	@RequestMapping(value = "{module}/{operationType}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView execute(CrescendoEntity crescendoEntity, Model model, @PathVariable("module") String module,
			@PathVariable("operationType") String operationType) {

		ModelAndView mav = new ModelAndView();
		try {
			crescendoResponse.setOperationType(operationType);
			crescendoResponse.setModuleName(module);
			crescendoResponse = crescendoServices.get(module).execute(crescendoEntity);
			//model.addAttribute("crescentoEntities", crescendoResponse.getCrescendoEntities());
			mav.addObject("crescentoEntities", crescendoResponse.getCrescendoEntities());
			mav.setViewName(crescendoResponse.getViewName() + "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ModelAndView("error","", model );
		}
		return mav;
	}
}
