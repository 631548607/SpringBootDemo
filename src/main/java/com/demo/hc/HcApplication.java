package com.demo.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.hc.*"})
public class HcApplication {
	public static void main(String[] args) {
		SpringApplication.run(HcApplication.class, args);
	}
}
