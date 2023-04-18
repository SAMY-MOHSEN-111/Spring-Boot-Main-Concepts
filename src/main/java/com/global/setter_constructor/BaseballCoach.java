package com.global.setter_constructor;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public void giveTraining() {
        System.out.println("Baseball coach");
    }
}
