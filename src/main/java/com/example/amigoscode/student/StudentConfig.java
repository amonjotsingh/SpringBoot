package com.example.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student amonjot = (Student.builder()
                    .name("Amonjot")
                    .age(25)
                    .email("chhinajot@gmail.com")
                    .build());
            Student manu = (Student.builder()
                    .name("Manu")
                    .age(27)
                    .email("manusimiriti@gmail.com")
                    .build());
            repository.saveAll(
                    List.of(amonjot, manu)
            );
        };
    }

}
