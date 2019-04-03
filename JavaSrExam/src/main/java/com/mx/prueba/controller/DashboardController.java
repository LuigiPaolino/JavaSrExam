package com.mx.prueba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mx.prueba.repository.UserRepository;

@Controller
public class DashboardController {

	private static Logger log = LoggerFactory.getLogger(DashboardController.class);
	private final UserRepository repository;
	
	@Autowired
	public DashboardController(UserRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/dashboard")
	public String getUsers(Model model) {
		model.addAttribute("users",repository.findAll());
		log.info("GetUsers Complete.");
		return "dashboard";
	}
}
