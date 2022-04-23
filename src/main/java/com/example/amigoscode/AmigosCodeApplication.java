package com.example.amigoscode;

import com.example.amigoscode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class AmigosCodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(AmigosCodeApplication.class, args);
    }


}
