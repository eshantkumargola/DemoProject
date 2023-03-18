package com.expertorion.demoproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.expertorion.demoproject.service.WebClientService;

import reactor.core.publisher.Flux;

@RestController
public class OrchestratorController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired 
	private WebClientService webClientService;
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@GetMapping("/orchestrator/{userid}" )
	public ResponseEntity<String> getCreditScore(@PathVariable int userid){
		
		String targetMicroserviceUrl= "http://localhost:9002/cs/get-score/"+userid;
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> httpEntity=new HttpEntity<>(headers);
		
		HttpEntity<String> 	response = restTemplate.exchange(targetMicroserviceUrl
												, HttpMethod.GET 
												, httpEntity ,String.class 
											);
				
		String responseBody=response.getBody();
		logger.info(" Response Body-1 is "+responseBody);		
		
		return new ResponseEntity<String>(responseBody,HttpStatus.OK);		
	}
	
	@GetMapping("/webclient/get-score/{userid}" )
	public ResponseEntity<Flux<Integer>> getCreditScoreViaWebClient(@PathVariable int userid){
		return ResponseEntity.ok().body(webClientService.getTargetMicroServiceResponse(userid));
		
	}
		
	
	
}
