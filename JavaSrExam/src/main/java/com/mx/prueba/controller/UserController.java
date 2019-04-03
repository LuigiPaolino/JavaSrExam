package com.mx.prueba.controller;

import java.util.Set;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mx.prueba.entities.User;
import com.mx.prueba.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log = LoggerFactory.getLogger(UserController.class);
	private final UserRepository repository;

	@Autowired
	public UserController(UserRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/{id}")
	public String getUser(@PathVariable Long id,Model model) {
		model.addAttribute("user",repository.findById(id));
		return "user";
	}
	
	@GetMapping("/add")
	public String addUser(Model model) {
		model.addAttribute("user",new User());
		return "user";
	}
	
	@GetMapping("/edit/{id}")
	public String editUser(@PathVariable Long id,Model model) {
		model.addAttribute("user",repository.findById(id));
		return "user";
	}
		
	@PostMapping("/add")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	log.info("User Error");
            return "user";
        }
         
        repository.save(user);
        model.addAttribute("users", repository.findAll());
        return "dashboard";
    }
	
	@PostMapping("/edit")
    public String editUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	log.info("User Error");
            return "user";
        }
         
        repository.save(user);
        model.addAttribute("users", repository.findAll());
        return "dashboard";
    }
	
	@GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {   		
		repository.deleteById(id);
		model.addAttribute("users", repository.findAll());
        return "dashboard";
    }
	
	@GetMapping("/search")
    public String editUser(@RequestParam String value, Model model) {
		Set<User> userList = repository.findByAddress(value);
		userList.addAll(repository.findByEmail(value));
		userList.addAll(repository.findByLastName(value));
		userList.addAll(repository.findByName(value));
		userList.addAll(repository.findByPhone(value));
        model.addAttribute("users", userList);
        return "dashboard";
    }
	
}
