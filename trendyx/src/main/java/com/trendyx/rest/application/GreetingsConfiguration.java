package com.trendyx.rest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.trendyx.rest.controllers")
public class GreetingsConfiguration extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GreetingsConfiguration.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GreetingsConfiguration.class);
	}

}
