package org.camunda.bpm.spring.boot.example.autodeployment.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalConfig {


    @Bean
    public String simpleStringBean() {
        return "Trulalal";
    }
}
