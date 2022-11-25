package com.ashokit;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		//List<User> findAll = userRepo.findAll();
		//List<User> findAll = userRepo.findAll(Sort.by("userId").descending());
		//List<User> findAll = userRepo.findAll(PageRequest.of(0, 2)).getContent();
		/*
		 * User entity=new User(); entity.setUserCountry("India"); Example<User>
		 * example=Example.of(entity); System.out.println(example);
		 */
		System.out.println("=======================================");
		/*
		 * List<User> findAll = userRepo.findAll(example); for(User user:findAll) {
		 * System.out.println(user); }
		 */
		
		//findAll.forEach(System.out::println);
		User entity=new User();
		entity.setUserName("Kl Rahul");
		entity.setUserAge(34);
		entity.setUserCountry("India");
		userRepo.save(entity);
		System.out.println("=========================================");
		context.close();
	}

}
