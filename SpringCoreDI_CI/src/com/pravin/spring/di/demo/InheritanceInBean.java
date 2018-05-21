package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.EmpForDependentObject;

@SuppressWarnings("deprecation")
public class InheritanceInBean {
    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	EmpForDependentObject collectionNonStringObject = (EmpForDependentObject) beanFactory
		.getBean("inheritedEmployeeBean");
	collectionNonStringObject.show();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	EmpForDependentObject collectionNonStringObject1 = applicationContext.getBean("inheritedEmployeeBean",
		EmpForDependentObject.class);
	collectionNonStringObject1.show();
    }
}
