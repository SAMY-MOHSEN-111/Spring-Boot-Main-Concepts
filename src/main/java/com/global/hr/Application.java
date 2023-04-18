package com.global.hr;

import com.global.setter_constructor.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    private Coach coach;

    @Autowired
    public Application(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
    }
    @Autowired
    public void doSomeStuff(@Qualifier("baseballCoach") Coach coach){
        this.coach = coach;
    }

    @PostConstruct
    public void checkSetterOrConstructor(){
        coach.giveTraining();
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
