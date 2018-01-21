package com.rayfocus.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootApp {

    @RequestMapping("/")
    public String defaultHome() {
        return "Hello World from Spring Boot!";
    }

    @RequestMapping("/springboot/{user}")
    public String userHome(@PathVariable("user") String user) {
        return "Hello " + user + ", Welcome to Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
