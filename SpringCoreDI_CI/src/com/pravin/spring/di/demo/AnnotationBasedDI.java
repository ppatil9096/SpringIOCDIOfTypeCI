package com.pravin.spring.di.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.di.bean.CompanyAnnotation;
import com.pravin.spring.di.config.AppConfig;

public class AnnotationBasedDI {
    public static void main(String[] args) {
	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
		AppConfig.class);
	CompanyAnnotation company = annotationConfigApplicationContext.getBean(CompanyAnnotation.class);
	company.showEmployeeInfo();
	annotationConfigApplicationContext.close();
    }
}
