package com.example.application.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tuhin = new Student(
                    1L,
                    "Tuhin",
                    "test@gmail.com",
                    LocalDate.of(2002, MAY, 14)
                );

            Student chloe = new Student(
                    2L,
                    "Chloe",
                    "test2@gmail.com",
                    LocalDate.of(2004, MAY, 19)
            );

            repository.saveAll(
                    List.of(tuhin, chloe)
            );


        };
    }
}
