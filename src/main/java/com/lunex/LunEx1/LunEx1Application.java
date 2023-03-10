package com.lunex.LunEx1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LunEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(LunEx1Application.class, args);
	}

}
