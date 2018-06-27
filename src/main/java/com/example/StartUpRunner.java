package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.example.entities.Person;
import com.example.entities.PersonRepository;

public class StartUpRunner implements CommandLineRunner{
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		logger.info("Init app from StartUpRunner");
		personRepository.save(new Person("Alex","Lopez"));
		personRepository.save(new Person("John","Dalthon"));
		personRepository.save(new Person("Terminator","T-800"));
		personRepository.save(new Person("Soom","T"));
		personRepository.save(new Person("Krithika","Goel"));
	}//Close run method.

}//Close StartUpRunner class.
