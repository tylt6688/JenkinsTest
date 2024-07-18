package org.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {

        System.out.println("项目启动成功");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World from Jenkins");
        }


        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
