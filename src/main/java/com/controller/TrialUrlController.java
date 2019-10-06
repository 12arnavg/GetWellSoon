package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.TrialUrl;
import com.service.GetWellSoonService;

@RestController
@RequestMapping("/urls")
@ComponentScan(basePackages = {"com.service"})
public class TrialUrlController {

	@Autowired
	private GetWellSoonService getWellSoonService;

	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public List<TrialUrl> getAllTrialUrls() {
		return getWellSoonService.getAllTrialUrls();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/get/id/{trialUrlId}")
	public TrialUrl getTrialUrl(@PathVariable int trialUrlId) {
		return getWellSoonService.getTrialUrl(trialUrlId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addTrialUrl(@RequestBody TrialUrl trialUrl) { 
		getWellSoonService.addTrialUrl(trialUrl);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/id/{trialUrlId}")
	public void updateTrialUrl(@PathVariable int trialUrlId, @RequestBody TrialUrl trialUrl) { 
		getWellSoonService.updateTrialUrl(trialUrlId, trialUrl);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/id/{trialUrlId}")
	public void deleteTrialUrl(@PathVariable int trialUrlId) { // 
		getWellSoonService.deleteTrialUrl(trialUrlId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete")
	public void deleteAllTrialUrls() {
		getWellSoonService.deleteAllTrialUrls();
	}
	
}