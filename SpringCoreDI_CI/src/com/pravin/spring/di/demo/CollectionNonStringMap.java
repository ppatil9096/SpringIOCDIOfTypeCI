package com.pravin.spring.di.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.di.bean.QuestionForCollectionNonStringObjectMap;

@SuppressWarnings("deprecation")
public class CollectionNonStringMap {
    public static void main(String[] args) {
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	QuestionForCollectionNonStringObjectMap collectionStringObject = (QuestionForCollectionNonStringObjectMap) beanFactory
		.getBean("questionNonStringCollectionMap");
	collectionStringObject.displayInfo();

	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	QuestionForCollectionNonStringObjectMap collectionStringObject1 = applicationContext
		.getBean("questionNonStringCollectionMap", QuestionForCollectionNonStringObjectMap.class);
	collectionStringObject1.displayInfo();
    }
}
