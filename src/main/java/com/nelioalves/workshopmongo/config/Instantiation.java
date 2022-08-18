package com.nelioalves.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		User maria=new User(null, "maria", "mariaaa@gmail.com");
		User josefinha=new User(null, "josefinha", "josefinha@gmail.com");
		User maricota=new User(null, "maricota", "maricota@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, josefinha,maricota));
		
		
	}

}
