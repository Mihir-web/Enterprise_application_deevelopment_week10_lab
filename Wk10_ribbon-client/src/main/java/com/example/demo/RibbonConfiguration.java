package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfiguration {

	@Bean(name = "ribbonRestTemplate")
	public RestTemplate ribbonRestTemplate() {
	    return new RestTemplate();
	}
}
