package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.QuestionForCollectionStringMap;

@SuppressWarnings("deprecation")
public class CollectionStringMap {
    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	QuestionForCollectionStringMap collectionStringObject = (QuestionForCollectionStringMap) beanFactory
		.getBean("questionStringCollectionMap");
	collectionStringObject.displayInfo();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	QuestionForCollectionStringMap collectionStringObject1 = applicationContext
		.getBean("questionStringCollectionMap", QuestionForCollectionStringMap.class);
	collectionStringObject1.displayInfo();
    }
}
