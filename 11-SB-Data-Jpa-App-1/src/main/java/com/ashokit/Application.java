package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository userRepo=context.getBean(UserRepository.class);
		System.out.println(userRepo.getClass().getName());
		
		
		/*
		 * User entity=new User(); entity.setId(104); entity.setName("Bibhuti");
		 * entity.setMob(6370652014l); entity.setAge(23); entity.setCountry("India");
		 * userRepo.save(entity);
		 */
		/*
		 * User entity1=new User(); entity1.setId(102); entity1.setName("Raja");
		 * entity1.setMob(1234567890l); entity1.setAge(23); entity1.setCountry("India");
		 * User entity2=new User(); entity2.setId(103); entity2.setName("Rama");
		 * entity2.setMob(9876543210l); entity2.setAge(23); entity2.setCountry("India");
		 * List<User> list=Arrays.asList(entity1,entity2); userRepo.saveAll(list);
		 */
		/*
		 * Optional<User> user=userRepo.findById(101); if(user.isPresent()) {
		 * System.out.println(user.get()); }
		 */
		/*
		 * List list=Arrays.asList(101,102); Iterable<User>
		 * users=userRepo.findAllById(list);
		 * users.forEach(user->System.out.println(user));
		 */
		/*
		 * Iterable users=userRepo.findAll();
		 * users.forEach(user->System.out.println(user));
		 */
		//userRepo.deleteById(101);
		
		  System.out.println( userRepo.existsById(101));
		  System.out.println(userRepo.count());
		 
		
		
	}

}
