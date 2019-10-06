package com.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trial;
import com.service.GetWellSoonService;

@CrossOrigin
@RestController
@RequestMapping("/trials")
@ComponentScan(basePackages = { "com.service" })
public class TrialController {

	@Autowired
	private GetWellSoonService getWellSoonService;

	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public List<Trial> getAllTrials(@RequestParam(value = "condition", required = false) String condition, @RequestParam (value = "gender", required = false) String gender, 
			@RequestParam (value = "age", required = false) Integer age, @RequestParam(value = "location", required = false) String location, @RequestParam (value = "distance", required = false) Integer distance) throws IOException, ParseException, JSONException {
		return getWellSoonService.getAllRelevantTrials(condition, gender, age, location);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/get/id/{trialId}")
	public Trial getTrial(@PathVariable int trialId) {
		return getWellSoonService.getTrial(trialId);
	}

	/*@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addTrial(@RequestBody Trial trial) {
		getWellSoonService.addTrial(trial);
	}*/

	@RequestMapping(method = RequestMethod.PUT, value = "/update/id/{trialId}")
	public void updateTrial(@PathVariable int trialId, @RequestBody Trial trial) {
		getWellSoonService.updateTrial(trialId, trial);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/id/{trialId}")
	public void deleteTrial(@PathVariable int trialId) { //
		getWellSoonService.deleteTrial(trialId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete")
	public void deleteAllTrials() {
		getWellSoonService.deleteAllTrials();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getBy/{condition}/{gender}/{age}/{location}")
	public List<Trial> getAllRelevantTrials(@PathVariable String condition, @PathVariable String gender,
			@PathVariable int age, @PathVariable String location) throws IOException, ParseException, JSONException {
		return getWellSoonService.getAllRelevantTrials(condition, gender, age, location);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getByDistance/{condition}/{gender}/{age}/{location}/{distance}")
	public List<Trial> getAllRelevantTrials(@PathVariable String condition, @PathVariable String gender,
			@PathVariable int age, @PathVariable String location, @PathVariable String distance)
			throws IOException, ParseException, JSONException {
		return getWellSoonService.getAllRelevantTrialsByDistance(condition, gender, age, location, distance);
	}

}
