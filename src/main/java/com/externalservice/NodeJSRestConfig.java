package com.externalservice;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NodeJSRestConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		
		ClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient());
		RestTemplate restTemplate = new RestTemplate(factory);
		
		return restTemplate;
	}
	
	private CloseableHttpClient httpClient() {
		//TODO Builder Patterns
		RequestConfig config = RequestConfig.custom()
				.setConnectionRequestTimeout(20000)
				.setConnectTimeout(20000)
				.setSocketTimeout(20000).build();
		return HttpClients.custom().setDefaultRequestConfig(config).build();
	}

}
