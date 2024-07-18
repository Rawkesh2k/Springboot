package com.springboot.amigoscode.AmigosCodeSpringBoot;

import com.springboot.amigoscode.AmigosCodeSpringBoot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigosCodeSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(AmigosCodeSpringBootApplication.class, args);
    }


}
