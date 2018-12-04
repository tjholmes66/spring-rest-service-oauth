package hello.config;

import org.springframework.boot.builder.SpringApplicationBuilder;

import hello.SpringSecurityApplication;

public class WebInitializer extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer
{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringSecurityApplication.class);
    }

}
