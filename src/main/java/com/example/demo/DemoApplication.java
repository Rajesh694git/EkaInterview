package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ContactRepository repository = context.getBean(ContactRepository.class);
		PlacesRepository placerepo = context.getBean(PlacesRepository.class);
		repository.save(new Contact("John"));
		repository.save(new Contact("Rohn"));
		try {
			//Answer to third question
			repository.delete(xxxx@yyy.com);
			System.out.println("Done");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		//Answer for fifth question
		placerepo.findContactByName("Chennai");


	}
}