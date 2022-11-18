package com.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() {
		System.out.println("Car::Constructor");
	}
	@PostConstruct
	public void init() {
		System.out.println("Car::init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Car::destroy");
	}

}
