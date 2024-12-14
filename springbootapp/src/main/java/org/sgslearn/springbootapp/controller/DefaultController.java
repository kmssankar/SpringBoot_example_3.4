package org.sgslearn.springbootapp.controller;

import org.sgslearn.springbootapp.dtos.DefaultResponse;
import org.sgslearn.springbootapp.services.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class DefaultController {
	@Autowired
	private DefaultService defaultService;
	
	@GetMapping("/default")
	public DefaultResponse getDefaultResponse() {
		return defaultService.getDefaultResponse();
	}

}
