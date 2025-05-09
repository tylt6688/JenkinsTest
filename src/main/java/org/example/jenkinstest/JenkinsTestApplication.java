package org.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {

        System.out.println("Project Run Successfully");

        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
