package com.whatweeat.yoojin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YoojinApplication {
	public static void main(String[] args) {
		SpringApplication.run(YoojinApplication.class, args);
	}
}