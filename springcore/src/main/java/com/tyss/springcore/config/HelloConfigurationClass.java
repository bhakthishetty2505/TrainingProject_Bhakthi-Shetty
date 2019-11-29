package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")
	//@Scope("prototype")   
	public Hello getHello() {
		
		Hello hello = new Hello();
		hello.setMsg("Python");
		return hello;
	}
	
	
}
