package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepo=context.getBean(UserRepository.class);
		User entity=new User();
		entity.setUserId(102);
		entity.setUserName("Raja");
		entity.setUserCountry("India");
		entity.setUserAge(23);
		userRepo.save(entity);
	}

}
