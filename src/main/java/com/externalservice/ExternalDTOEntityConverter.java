package com.externalservice;

import java.util.ArrayList;
import java.util.List;

import com.model.Condition;
import com.model.Location;
import com.model.Trial;

public class ExternalDTOEntityConverter {

	public static Trial convertToTrial(TrialInfo info) {

		Trial trial = new Trial();

		trial.setTrialUniqueId(info.getId());

		trial.setTrialMaxAge(info.getMaxage());

		trial.setTrialMinAge(info.getMinage());

		trial.setTrialPhase(info.getPhase());

		trial.setTrialSponsor(info.getSponsor());

		trial.setTrialParticipantCount(info.getParticipants());

		trial.setTrialSponsor(info.getSponsor());

		trial.setTrialPurpose(info.getPurpose());

		trial.setTrialGender(info.getGender());

		trial.setTrialName(info.getName());

		List<Condition> conditions = new ArrayList<>();
		for (String condition : info.getConditionList()) {

			Condition current = new Condition();
			current.setConditionName(condition);
			conditions.add(current);
		}
		//trial.setConditions(conditions);

		Condition condition = new Condition();
		List<Trial> trials = new ArrayList<>();
		trials.add(trial);
		//condition.setTrials(trials);

		List<Location> locations = new ArrayList<>();
		for (int x = 0; x < info.getLocationList().length; x++) {

			Location current = new Location();
			if (info.getLocationList()[x].getName() == null) {
				current.setLocationName("");
			} else {
				current.setLocationName(info.getLocationList()[x].getName());
			}
			
			if (info.getLocationList()[x].getZip() == null) {
				current.setLocationZip("");
			} else {
				current.setLocationZip(info.getLocationList()[x].getZip());
			}
			locations.add(current);
			//current.setTrial(trial);
		}

		trial.setLocations(locations);

		return trial;
	}

}
