package com.pravin.spring.di.bean;

import java.util.Map;

public class QuestionForCollectionStringMap {
    private int id;
    private String name;
    private Map<String, String> answers;

    public QuestionForCollectionStringMap(int id, String name, Map<String, String> answers) {
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
