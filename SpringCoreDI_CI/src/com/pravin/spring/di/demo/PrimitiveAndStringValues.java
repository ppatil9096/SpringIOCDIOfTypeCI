package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.Employee;

@SuppressWarnings("deprecation")
public class PrimitiveAndStringValues {

    public static void main(String[] args) {

	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	Employee s = (Employee) factory.getBean("primitivAndStringEmployee");
	s.show();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	Employee employeeUsingAppContext1 = (Employee) applicationContext.getBean("primitivAndStringEmployee");
	employeeUsingAppContext1.show();
	Employee employeeUsingAppContext2 = applicationContext.getBean("primitivAndStringEmployee", Employee.class);
	employeeUsingAppContext2.show();
    }
}
