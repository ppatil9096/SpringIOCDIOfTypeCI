package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.EmpForDependentObject;

@SuppressWarnings("deprecation")
public class DependentObject {

    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	EmpForDependentObject dependentObject = (EmpForDependentObject) beanFactory.getBean("dependentEmployee");
	dependentObject.show();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	EmpForDependentObject dependentObject1 = (EmpForDependentObject) applicationContext
		.getBean("dependentEmployee");
	dependentObject1.show();
	EmpForDependentObject dependentObject2 = applicationContext.getBean("dependentEmployee",
		EmpForDependentObject.class);
	dependentObject2.show();
    }
}
