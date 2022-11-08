package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class Spring_IOC_DI_Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("in/ashokit/cfgs/applicationContext.xml");
		Car car=ctx.getBean(Car.class);
		car.drive();
		ctx.close();
	}

}
