package com.legal.legal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LegalApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LegalApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LegalApplication.class);
    }
//	public static void main(String[] args) {
//
//		SpringApplication.run(LegalApplication.class, args);
//	}
}
