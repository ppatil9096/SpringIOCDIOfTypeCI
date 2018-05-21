package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.QuestionForCollectionStringList;

@SuppressWarnings("deprecation")
public class CollectionStringList {
    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	QuestionForCollectionStringList collectionList = (QuestionForCollectionStringList) beanFactory
		.getBean("collectionStringListQuestion");
	collectionList.displayInfo();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	QuestionForCollectionStringList collectionList1 = (QuestionForCollectionStringList) applicationContext
		.getBean("collectionStringListQuestion");
	collectionList1.displayInfo();
	QuestionForCollectionStringList collectionList2 = applicationContext.getBean("collectionStringListQuestion",
		QuestionForCollectionStringList.class);
	collectionList2.displayInfo();
    }
}
