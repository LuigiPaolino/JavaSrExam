package com.mx.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mx.prueba.entities.User;
import com.mx.prueba.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JavaSrExamApplication implements WebMvcConfigurer{

	private static final Logger log = LoggerFactory.getLogger(JavaSrExamApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaSrExamApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new User("Luigi", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luigi2", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luigi3", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luis", "Perez", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luis2", "Perez", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			log.info("BD Initialized.");
		};
	}
	
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/user").setViewName("user");
    }
}
