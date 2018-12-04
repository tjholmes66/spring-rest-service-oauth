package com.carecentrix.security.app.config;

import org.springframework.boot.builder.SpringApplicationBuilder;

import com.carecentrix.security.app.SpringSecurityApplication;

public class WebInitializer extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer
{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringSecurityApplication.class);
    }

}
