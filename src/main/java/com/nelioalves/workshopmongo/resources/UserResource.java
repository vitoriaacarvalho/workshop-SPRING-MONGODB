package com.nelioalves.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<User> findAll(){
		User maria=new User(null, "maria", "maria@gmail.com");
		User mariane=new User(null, "mariane", "mariane@gmail.com");
		User joao=new User(null, "joao", "joao@gmail.com");
		List<User> list=new ArrayList<>();
		list.addAll(Arrays.asList(maria, mariane,joao));
		return list;
	}
	
	
}
