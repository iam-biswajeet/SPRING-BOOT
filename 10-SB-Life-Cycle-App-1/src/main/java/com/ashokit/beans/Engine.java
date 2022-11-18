package com.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Engine implements InitializingBean,DisposableBean{
	public Engine() {
		System.out.println("Engine::Constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Engine::destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Engine::afterPropertiesSet");
		
	}
	
}
