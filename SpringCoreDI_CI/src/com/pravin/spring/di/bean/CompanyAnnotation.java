package com.pravin.spring.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyAnnotation {
    private EmployeeAnnotation employeeAnnotation;

    @Autowired
    public CompanyAnnotation(EmployeeAnnotation employeeAnnotation) {
	super();
	this.employeeAnnotation = employeeAnnotation;
    }

    public void showEmployeeInfo() {
	employeeAnnotation.showEmployeeInfo();
    }

}
