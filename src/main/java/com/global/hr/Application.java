package com.global.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.global",
                "com.global.hr"
        }
)
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan(
//        basePackages = {
//                "com.global.hr"
//        }
//)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
