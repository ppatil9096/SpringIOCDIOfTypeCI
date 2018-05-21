package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.QuestionForCollectionNonStringObject;

@SuppressWarnings("deprecation")
public class CollectionNonStringList {
    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	QuestionForCollectionNonStringObject collectionNonStringObject = (QuestionForCollectionNonStringObject) beanFactory
		.getBean("questionNonStringCollection");
	collectionNonStringObject.displayInfo();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	QuestionForCollectionNonStringObject collectionNonStringObject1 = applicationContext
		.getBean("questionNonStringCollection", QuestionForCollectionNonStringObject.class);
	collectionNonStringObject1.displayInfo();
    }
}
