package com.expertorion.demoproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class WebClientService {

	private final WebClient webClient; // Using Constuctor DI as below constructor
	
	private final String targetMicroServiceUrl="http://localhost:9002";
	
	public WebClientService(WebClient.Builder webClientBuilder) {
		this.webClient=webClientBuilder.baseUrl(targetMicroServiceUrl).build();		
	}
		
	public Flux<Integer> getTargetMicroServiceResponse(int userid ){
		return webClient.get()
				.uri("/cs/get-score/"+userid)
				.retrieve()
				.bodyToFlux(Integer.class);
	}
	
}
