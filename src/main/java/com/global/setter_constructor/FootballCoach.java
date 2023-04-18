package com.global.setter_constructor;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public void giveTraining() {
        System.out.println("Football Coach");
    }
}
