package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.externalservice.NodeJSExternalService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Condition;
import com.model.Intervention;
import com.model.Location;
import com.model.Patient;
import com.model.Trial;
import com.model.TrialCondition;
import com.model.TrialUrl;
import com.repository.ConditionRepository;
import com.repository.InterventionRepository;
import com.repository.LocationRepository;
import com.repository.PatientRepository;
import com.repository.TrialConditionRepository;
import com.repository.TrialLocationRepository;
import com.repository.TrialRepository;
import com.repository.TrialUrlRepository;

@Service
public class GetWellSoonService {

	@Autowired
	private ConditionRepository conditionRepository;

	@Autowired
	private TrialConditionRepository trialConditionRepository;

	@Autowired
	private TrialLocationRepository trialLocationRepository;

	public List<Condition> getAllConditions() {
		return (List<Condition>) conditionRepository.findAll();
	}

	public Condition getCondition(int conditionId) {
		return conditionRepository.findById(conditionId).get();
	}

	public void addCondition(Condition condition) {
		conditionRepository.save(condition);
	}

	public void updateCondition(int conditionId, Condition condition) {
		conditionRepository.save(condition);
	}

	public void deleteCondition(int id) {
		conditionRepository.deleteById(id);
	}

	public void deleteAllConditions() throws IOException {
		conditionRepository.deleteAll();
	}

	@Autowired
	private InterventionRepository interventionRepository;

	public List<Intervention> getAllInterventions() {
		return (List<Intervention>) interventionRepository.findAll();
	}

	public Intervention getIntervention(int interventionId) {
		return interventionRepository.findById(interventionId).get();
	}

	public void addIntervention(Intervention intervention) {
		interventionRepository.save(intervention);
	}

	public void updateIntervention(int interventionId, Intervention intervention) {
		interventionRepository.save(intervention);
	}

	public void deleteIntervention(int id) {
		interventionRepository.deleteById(id);
	}

	public void deleteAllInterventions() {
		interventionRepository.deleteAll();
	}

	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getAllLocations() {
		return (List<Location>) locationRepository.findAll();
	}

	public Location getLocation(int locationId) {
		return locationRepository.findById(locationId).get();
	}

	public void addLocation(Location location) {
		locationRepository.save(location);
	}

	public void updateLocation(int locationId, Location location) {
		locationRepository.save(location);
	}

	public void deleteLocation(int id) {
		locationRepository.deleteById(id);
	}

	public void deleteAllLocations() {
		locationRepository.deleteAll();
	}

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatients() {
		return (List<Patient>) patientRepository.findAll();
	}

	public Patient getPatient(int patientId) {
		return patientRepository.findById(patientId).get();
	}

	public void addPatient(Patient patient) {
		patientRepository.save(patient);
	}

	public void updatePatient(int patientId, Patient patient) {
		patientRepository.save(patient);
	}

	public void deletePatient(int id) {
		patientRepository.deleteById(id);
	}

	public void deleteAllPatients() {
		patientRepository.deleteAll();
	}

	@Autowired
	private TrialRepository trialRepository;

	@Autowired
	private NodeJSExternalService externalService;

	public List<Trial> getAllTrials() {
		return (List<Trial>) trialRepository.findAll(new PageRequest(0, 1000)).getContent();
	}

	public Trial getTrial(int trialId) {
		return trialRepository.findById(trialId).get();
	}
	/*
	 * public void addTrial(Trial trial) { List<Location> lsLocations =
	 * trial.getLocations(); for (Location location : lsLocations) { Trial lsTrial =
	 * location.getTrial(); location.setTrial(lsTrial); }
	 * trialRepository.save(trial); }
	 */

	public void updateTrial(int trialId, Trial trial) {
		trialRepository.save(trial);
	}

	public void deleteTrial(int id) {
		trialRepository.deleteById(id);
	}

	public void deleteAllTrials() {
		trialRepository.deleteAll();
	}
	/*
	 * public List<String> fetchUrlsinBatches(int num) { List<String> finalUrls =
	 * new ArrayList<>(); List<String> allTrials = trialRepository.fetchAllTrials();
	 * for (int i = 0; i < 500; i += 100) { List<String> urlBatch =
	 * trialUrlRepository.fetchUrls(i + num); for (String current : urlBatch) { if
	 * (allTrials.contains(current) == false) { finalUrls.addAll(urlBatch); } }
	 * 
	 * for (String url : urlBatch) { fetchTrialInfo(url); } } return finalUrls; }
	 * 
	 * public void makeRequests() { int completedRequests = 0; for (int i =
	 * completedRequests * 500; i < 6000; i += 500) { fetchUrlsinBatches(i);
	 * completedRequests++; } }
	 */
	/*
	 * public void fetchTrialInfo(String urlName) {
	 * 
	 * System.out.println(urlName); TrialInfo info =
	 * externalService.fetchTrialInfo(urlName); addTrial(convertToTrial(info));
	 * 
	 * }
	 */

	@Autowired
	private TrialUrlRepository trialUrlRepository;

	public List<TrialUrl> getAllTrialUrls() {
		return (List<TrialUrl>) trialUrlRepository.findAll();
	}

	public TrialUrl getTrialUrl(int trialUrlId) {
		return trialUrlRepository.findById(trialUrlId).get();
	}

	public void addTrialUrl(TrialUrl trialUrl) {
		trialUrlRepository.save(trialUrl);
	}

	public void updateTrialUrl(int trialUrlId, TrialUrl trialUrl) {
		trialUrlRepository.save(trialUrl);
	}

	public void deleteTrialUrl(int id) {
		trialUrlRepository.deleteById(id);
	}

	public void deleteAllTrialUrls() {
		trialUrlRepository.deleteAll();
	}

	/*
	 * public void fetchFromSource(String url) {// TODO log SLF4j phase 2
	 * 
	 * int nextPage = 1; boolean morePages = true; while (morePages == true) {
	 * List<String> urls = trialRepository.fetchAllUrls(); for (String listing :
	 * urls) { Trial currenturl = new Trial(listing); addTrial(currenturl); } if
	 * (nextPage % 5 == 0) { morePages = false; } nextPage++; }
	 * 
	 * }
	 */
	/*
	 * // trial matching public void main(String[] args) {
	 * System.out.println("Running ik"); List<Trial> trials = getAllTrials();
	 * System.out.println(doesConditionMatch(trials.get(0), "Refractive Errr")); }
	 */
	/*
	 * public boolean doesConditionMatch(Trial trial, String condition) {
	 * 
	 * if (condition.matches("leukemia")){ System.out.println("We are iks"); return
	 * true; }
	 * 
	 * 
	 * List<Condition> conditions = trial.getConditions(); for (int x = 0; x <
	 * conditions.size(); x++) { String cName =
	 * conditions.get(x).getConditionName(); Pattern thePattern =
	 * Pattern.compile(condition); Matcher m = thePattern.matcher(cName); if
	 * (m.matches()) { return true; } return m.hitEnd(); if
	 * (cName.contains(condition)) { System.out.println("We are iks"); return true;
	 * }
	 * 
	 * } return false;
	 * 
	 * }
	 */
	public boolean doesGenderMatch(Trial trial, String gender) {
		String trialGender = trial.getTrialGender();
		return (trialGender.equals("B") || trialGender.equals(gender));
	}

	public boolean doesAgeMatch(Trial trial, int age) {
		int trialMaxAge = trial.getTrialMaxAge();
		int trialMinAge = trial.getTrialMinAge();
		return (age <= trialMaxAge && age >= trialMinAge);
	}

	public boolean doesDistanceMatch(Trial trial, String distance, String location)
			throws IOException, ParseException, JSONException {
		if (distance.equals("50") && getMinDistanceByTrial(trial, location) < 50) {
			return true;
		} else if (distance.equals("100") && getMinDistanceByTrial(trial, location) < 100) {
			return true;
		} else if (distance.equals("200") && getMinDistanceByTrial(trial, location) < 200) {
			return true;
		} else if (distance.equals("any")) {
			return true;
		}
		return false;
	}

	public double getMinDistanceByTrial(Trial trial, String location)
			throws IOException, ParseException, JSONException {
		double minDistance = Double.MAX_VALUE;
		/*
		 * List<Location> lsLocations = trial.getLocations(); for (int x = 0; x <
		 * lsLocations.size(); x++) { Double distance =
		 * getDistanceBetweenLocations(location, lsLocations.get(x).getLocationZip());
		 * if (distance < minDistance) { minDistance = distance; } }
		 */
		return minDistance;
	}

	public List<Trial> sortTrialsByLocation(List<Trial> trials, String location)
			throws IOException, ParseException, JSONException {

		for (int outer = 1; outer < trials.size(); outer++) {
			int index = outer - 1;
			Trial temp = trials.get(outer);
			while (index >= 0 && compareTrials(temp, trials.get(index), location)) {
				trials.set(index + 1, trials.get(index));
				index--;
			}
			trials.set(index + 1, temp);
		}
		return trials;
	}

	public boolean compareTrials(Trial trial1, Trial trial2, String location)
			throws IOException, ParseException, JSONException {
		double minDistance1 = getMinDistanceByTrial(trial1, location);
		double minDistance2 = getMinDistanceByTrial(trial2, location);
		return (minDistance2 > minDistance1);
	}

	public double getDistanceBetweenLocations(String zip1, String zip2)
			throws IOException, ParseException, JSONException {
		final String url = "https://api.zip-codes.com/ZipCodesAPI.svc/1.0/CalculateDistance/ByZip?fromzipcode=" + zip1
				+ "&tozipcode=" + zip2 + "&key=CWDZWQKP6XBQMC65JD0A";
		RestTemplate restTemplate = new RestTemplate();
		Object response = restTemplate.getForObject(url, Object.class);
		ObjectMapper mapper = new ObjectMapper();
		String requestBean = mapper.writeValueAsString(response);
		JSONObject json = new JSONObject(requestBean);
		return json.getDouble("DistanceInMiles");
	}

	public List<Trial> getAllRelevantTrials(String condition, String gender, Integer age, String location)
			throws IOException, ParseException, JSONException {
		List<Trial> trials;
		List<Integer> trialIds = new ArrayList<>();
		;
		List<Condition> conditions = null;
		List<TrialCondition> trialConditions = null;
		if (StringUtils.isNotBlank(condition)) {
			if (!condition.startsWith("%")) {
				condition = "%" + condition;
			}
			if (!condition.endsWith("%")) {
				condition = condition + "%";
			}
			conditions = conditionRepository.findAllByCondition(condition);
			List<Integer> conditionIds = new ArrayList<>();
			for (Condition condition1 : conditions) {
				conditionIds.add(condition1.getConditionId());
			}
			trialConditions = trialConditionRepository.getTrials(conditionIds);
			for (TrialCondition trialCondition : trialConditions) {
				trialIds.add(trialCondition.getTrialId());
			}
			trials = trialRepository.fetchAllTrialById(trialIds);
			trialIds.clear();
		} else {
			trials = getAllTrials();
		}

		Map<Integer, Trial> map = new HashMap<>();
		for (int x = 0; x < trials.size(); x++) {
			Trial t = trials.get(x);
			map.put(t.getTrialId(), t);
			// }
			// }
			trialIds.add(t.getTrialId());
		}

		List<Location> trialLocations = locationRepository.findAllByTrialIds(trialIds);
		if (trialConditions == null) {
			trialConditions = trialConditionRepository.getConditions(trialIds);
		}
		if (conditions == null) {
			List<Integer> conditionIds = new ArrayList<>();
			for (TrialCondition trialCondition : trialConditions) {
				conditionIds.add(trialCondition.getConditionId());
			}
			conditions = conditionRepository.findAllById(conditionIds);
		}

		Map<Integer, Condition> conditionById = new HashMap<>();
		for (Condition condition2 : conditions) {
			conditionById.put(condition2.getConditionId(), condition2);
		}

		for (TrialCondition trialCondition : trialConditions) {
			Trial trial = map.get(trialCondition.getTrialId());
			Condition condition2 = conditionById.get(trialCondition.getConditionId());
			if (trial != null && condition2 != null) {
				trial.getConditions().add(condition2);
			}
		}

		for (Location trialLocation : trialLocations) {
			Trial trial = map.get(trialLocation.getTrialId());
			if (trial != null) {
				trial.getLocations().add(trialLocation);
			}
		}

		// relevantTrials = sortTrialsByLocation(relevantTrials, location);
		return trials;
	}

	public List<Trial> getAllRelevantTrialsByDistance(String condition, String gender, int age, String location,
			String distance) throws IOException, ParseException, JSONException {

		List<Trial> trials = getAllTrials();
		List<Trial> relevantTrials = new ArrayList<Trial>();
		for (int x = 0; x < trials.size(); x++) {
			Trial t = trials.get(x);
			if (doesGenderMatch(t, gender) && doesAgeMatch(t, age) && doesDistanceMatch(t, distance, location)) {
				relevantTrials.add(t);
			}
		}
		relevantTrials = sortTrialsByLocation(relevantTrials, location);
		return relevantTrials;
	}

}
