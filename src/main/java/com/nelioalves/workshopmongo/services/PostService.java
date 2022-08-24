package com.nelioalves.workshopmongo.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.exception.ObjectNotFoundException;
import com.nelioalves.workshopmongo.repositories.PostRepository;

@Service
public class PostService implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired
	private PostRepository repo;
	
	public Optional<Post> findById(String id){
		Optional<Post> user=repo.findById(id);
		if (user==null) {
			throw new ObjectNotFoundException("object not found");
		}
		return user;
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContaining(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
