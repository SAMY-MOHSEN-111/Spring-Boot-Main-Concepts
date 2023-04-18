package com.global.hr;

import com.global.setter_constructor.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

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
    @Value("${image.location.path}")
    private String path;
    
    @Autowired
    private Environment environment;

    @Autowired
    public Application(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
    }
    @Autowired
    public void doSomeStuff(@Qualifier("baseballCoach") Coach coach){
        this.coach = coach;
    }

    // setter injection overrides constructor injection
    @PostConstruct
    public void checkSetterOrConstructor(){
        coach.giveTraining();
        System.out.println(path);
        System.out.println(environment.getProperty("image.location.path"));
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
