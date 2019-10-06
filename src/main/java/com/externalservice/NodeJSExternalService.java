package com.externalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class NodeJSExternalService {

	@Autowired
	private RestTemplate restTemplate;

	public TrialInfo fetchTrialInfo(String url) {

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("trialurl", url);

		String trialUrl = "http://localhost:8080/clinicalgovtrials";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

		ResponseEntity<TrialInfo> response = restTemplate.postForEntity(trialUrl, request, TrialInfo.class);

		if (response != null) {
			return response.getBody();
		} else {
			return null;
		}
	}

	public Integer fetchBatchNumber(int batchNum) {

		MultiValueMap<String, Integer> map = new LinkedMultiValueMap<>();
		map.add("batchNumber", batchNum);

		String trialUrl = "http://localhost:8080/trials/trialinfo";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<MultiValueMap<String, Integer>> request = new HttpEntity<>(map, headers);

		ResponseEntity<Integer> response = restTemplate.postForEntity(trialUrl, request, Integer.class);

		if (response != null) {
			return response.getBody();
		} else {
			return null;
		}
	}
}
