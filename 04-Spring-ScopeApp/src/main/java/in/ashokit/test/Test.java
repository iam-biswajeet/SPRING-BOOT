package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.TokenGenerator;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		TokenGenerator bean1=context.getBean(TokenGenerator.class);
		System.out.println(bean1.hashCode());
		TokenGenerator bean2=context.getBean(TokenGenerator.class);
		System.out.println(bean2.hashCode());
		TokenGenerator bean3=context.getBean(TokenGenerator.class);
		System.out.println(bean3.hashCode());
	
	
	}

}
