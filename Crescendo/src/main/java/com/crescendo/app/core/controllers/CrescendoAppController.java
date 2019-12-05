package com.crescendo.app.core.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crescendo.app.constants.Module;
import com.crescendo.app.core.components.CrescendoRequest;
import com.crescendo.app.core.components.CrescendoResponce;
import com.crescendo.app.services.CrescendoManagementServices;

@Controller
@RequestMapping("/")
public class CrescendoAppController {
	@Autowired
	private Map<Module, CrescendoManagementServices> crescendoServices;

	@RequestMapping(value = "{module}", method = { RequestMethod.GET, RequestMethod.POST })
	public String execute(CrescendoRequest crescendoRequest, Model model) {

		CrescendoResponce responce = crescendoServices.get(crescendoRequest.getModule())
				.execute(crescendoRequest.getCrescendoEntities());
		model.addAttribute("crescentoEntities", responce.getCrescendoEntities());
		return responce.getViewName();
	}
}
