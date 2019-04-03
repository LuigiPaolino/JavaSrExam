package com.mx.prueba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogInController {
	
	private static Logger log = LoggerFactory.getLogger(LogInController.class);
	
	@GetMapping("/login")
	public String login() {
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	        if (auth != null) {
	        	if (auth.getName() == "user") {
		            log.info(auth.getName() + " was trying to access protected resource.");
		            return "dashboard";
	        	}
	        }		
	        return "login"; 
    }
}
