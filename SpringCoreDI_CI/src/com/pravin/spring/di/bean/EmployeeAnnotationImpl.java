package com.pravin.spring.di.bean;

public class EmployeeAnnotationImpl implements EmployeeAnnotation {

    @Override
    public void showEmployeeInfo() {
	System.out.println("inside the emp info implementation");
    }

}
