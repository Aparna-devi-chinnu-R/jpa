package com.example.jpa;

import com.example.jpa.model.Person;
import com.example.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	final
	PersonRepository personRepository;

	@Autowired
	public JpaApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------------------------------------------");
		System.out.println(personRepository.findById(10001));
		personRepository.deleteById(10002);
		System.out.println(personRepository.update(new Person(10001,"Updated Name","Updated Location")));
		System.out.println(personRepository.insert(new Person(10004,"New Name","New Location")));
		System.out.println(personRepository.findAll());
		System.out.println("---------------------------------------------");

	}
}
