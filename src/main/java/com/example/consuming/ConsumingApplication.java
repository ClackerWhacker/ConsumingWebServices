package com.example.consuming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingApplication {

	// if you have a problem with spring not being able to find a bean define a custom bean
	// for yourself via the below. This is typically done in the Configuration task
	// This is if @autowired on its own does not work.
	// If it doesn't use the below and @Autowired or @Inject
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumingApplication.class, args);
	}

}
