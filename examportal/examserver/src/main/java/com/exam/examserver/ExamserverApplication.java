package com.exam.examserver;

import com.exam.examserver.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code.........");

		User user = new User();

		user.setFirstname("Mriganka");
		user.setLastname("Bhadra");
		user.setUsername("mrignka123")
		;
	}
}
