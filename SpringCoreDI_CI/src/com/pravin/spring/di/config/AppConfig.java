package com.pravin.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pravin.spring.di.bean.EmployeeAnnotation;
import com.pravin.spring.di.bean.EmployeeAnnotationImpl;

@Configuration
@ComponentScan(basePackages = { "com.pravin.spring.di.bean" })
public class AppConfig {
    @Bean
    public EmployeeAnnotation getEmployeeAnnotation() {
	return new EmployeeAnnotationImpl();
    }
}
