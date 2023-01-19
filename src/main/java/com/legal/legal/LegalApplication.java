package com.legal.legal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

 @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
 @Controller
@CrossOrigin
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
