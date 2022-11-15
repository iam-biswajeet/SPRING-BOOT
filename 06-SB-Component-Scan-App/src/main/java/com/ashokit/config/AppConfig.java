package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.Engine;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("**AppConfig::No arg Constructor**");
	}
	@Bean
	public Engine getInstance() {
		Engine eng=new Engine();
		return eng;
	}

}
