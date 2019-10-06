package com.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.service.GetWellSoonService;

@Component
public class ScheduledTasks {

	@Autowired
	private GetWellSoonService service;

	@Scheduled(cron = "0 15 22 * * 1") // TODO change cron expression, fetch from url
	public void getTrialUrlsUsingCron() {
		//service.makeRequests();// TODO nodejs should accept url from spring
	}

}