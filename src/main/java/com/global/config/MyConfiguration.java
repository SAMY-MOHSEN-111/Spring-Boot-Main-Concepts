package com.global.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Configuration
//@Scope("prototype")
//public class MyConfiguration {
//    @Bean
//    CommandLineRunner runner (){
//        return args -> System.out.println("hello world");
//    }
//}

@Component
public class MyConfiguration implements ApplicationRunner,CommandLineRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Application Runner...");
    }

    @Override
    public void run(String... args) {
        System.out.println("Command Line Runner...");
    }

}