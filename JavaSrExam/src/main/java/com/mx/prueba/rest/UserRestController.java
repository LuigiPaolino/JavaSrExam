package com.mx.prueba.rest;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.prueba.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserRestController {

	private final UserRepository repository;

	@Autowired
	public UserRestController(UserRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/token")
	  public Map<String,String> token(HttpSession session) {
	    return Collections.singletonMap("token", session.getId());
	}
	
}