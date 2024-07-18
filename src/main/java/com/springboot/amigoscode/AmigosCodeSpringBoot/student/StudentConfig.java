package com.springboot.amigoscode.AmigosCodeSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rakesh = new Student(
                    "Rakesh@aws.com",
                    "Rakesh KK",
                    LocalDate.of(2002, AUGUST, 9));

            Student pappa = new Student(
                    "pappa@aws.com",
                    "Pappa",
                    LocalDate.of(1994, JANUARY, 1));
            repository.saveAll(
                    List.of(rakesh, pappa)
            );
        };
    }
}
