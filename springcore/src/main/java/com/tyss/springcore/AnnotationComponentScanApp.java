package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.config.ComponentScanConfiguration;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Python");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Bruno");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
