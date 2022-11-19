package com.ashokit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UsersRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UsersRepository userRepo = context.getBean(UsersRepository.class);
		System.out.println(userRepo.getClass());
		System.out.println(userRepo.count());
		/*
		 * User entity=new User();
		 * 
		 * entity.setId(105); entity.setName("Jyoti"); entity.setPhno(7735058011l);
		 * entity.setAge(20); entity.setCountry("India"); userRepo.save(entity);
		 */
		/*
		 * User entity1=new User(); entity1.setId(106); entity1.setName("Bishnu");
		 * entity1.setPhno(7978165848l); entity1.setAge(22);
		 * entity1.setCountry("India"); User entity2=new User(); entity2.setId(107);
		 * entity2.setName("Ramaksnta"); entity2.setPhno(7978165848l);
		 * entity2.setAge(25); entity2.setCountry("India"); List<User>
		 * list=Arrays.asList(entity1,entity2); userRepo.saveAll(list);
		 */
		System.out.println(userRepo.existsById(101));
		System.out.println("=============================");
		Optional<User> o=userRepo.findById(101);
		if(o.isPresent()) {
			System.out.println(o.get());
		}
		System.out.println("========================================");
		Iterable<User> list=userRepo.findAllById(Arrays.asList(101,102));
		list.forEach(System.out::println);
		System.out.println("=====================================");
		Iterable<User> users=userRepo.findAll();
		users.forEach(System.out::println);
		System.out.println("==================================");
		userRepo.deleteById(107);
		context.close();

	}

}
