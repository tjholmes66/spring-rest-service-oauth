package com.carecentrix.security.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.carecentrix.security")
public class SpringSecurityApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
