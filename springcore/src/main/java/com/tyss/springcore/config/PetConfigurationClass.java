package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {

	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name = "pet")
	public Pet getPet() {
		
		Pet pet = new Pet();
		pet.setName("Pluto");
		//pet.setAnimal(getDog());		//wiring
		return pet;
	}
}
