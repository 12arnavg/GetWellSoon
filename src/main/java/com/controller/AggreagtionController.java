package com.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/aggreagation")
@ComponentScan(basePackages = {"com.service"})
public class AggreagtionController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getAllPatients() {
		return "Ok we are good";
	}
	

}
