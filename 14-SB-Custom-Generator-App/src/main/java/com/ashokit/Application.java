package com.ashokit;



import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.OrderDetailsEntity;
import com.ashokit.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		OrderDetailsRepository orderRepo=ctx.getBean(OrderDetailsRepository.class);
		OrderDetailsEntity entity=new OrderDetailsEntity();
		entity.setOrderBy("Biswajit");
		entity.setOrderDt(new Date());
		OrderDetailsEntity saveEnty = orderRepo.save(entity);
		System.out.println(saveEnty);
		ctx.close();
	}

}
