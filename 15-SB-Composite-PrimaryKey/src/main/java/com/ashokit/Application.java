package com.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Account;
import com.ashokit.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		AccountService service = ctx.getBean(AccountService.class);
		//AccountRepository bean = ctx.getBean(AccountRepository.class);
		//service.saveAccount();
		Optional<Account> account = service.getAccount();
		if(account.isPresent()) {
			System.out.println(account.get());
		}
	}

}
