package com.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(value={FlowerComponentConfigImpl.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
