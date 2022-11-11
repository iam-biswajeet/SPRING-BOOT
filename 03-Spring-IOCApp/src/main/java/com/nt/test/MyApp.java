package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ATM;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ATM atm=ctx.getBean(ATM.class);
		String status=atm.withdraw(2000.55);
		System.out.println(status);
	}
}
