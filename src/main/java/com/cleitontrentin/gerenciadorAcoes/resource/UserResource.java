package com.cleitontrentin.gerenciadorAcoes.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleitontrentin.gerenciadorAcoes.Entites.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "cleiton", "cleiton.trentin@gmail.com", "999566024", "123");
		return ResponseEntity.ok().body(u);
	
	}

}
