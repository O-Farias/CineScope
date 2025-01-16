package com.cinescope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CineScopeApplication.class, args);
        System.out.println("🔥 CineScope está rodando! 🚀");
    }
}
