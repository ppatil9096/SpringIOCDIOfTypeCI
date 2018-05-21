package com.pravin.spring.di.bean;

import java.util.Map;

public class QuestionForCollectionNonStringObjectMap {
    private int id;
    private String name;
    private Map<Answer, User> answers;

    public QuestionForCollectionNonStringObjectMap(int id, String name, Map<Answer, User> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println("question id :: " + id);
	System.out.println("question name :: " + name);
	System.out.println("Answers :: ");
	answers.forEach((K, V) -> {
	    System.out.println("Answer :: " + K + "\tPosted By :: " + V);
	});
    }

}
