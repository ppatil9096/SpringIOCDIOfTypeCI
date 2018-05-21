package com.pravin.spring.di.bean;

import java.util.List;

public class QuestionForCollectionNonStringObject {
    private int id;
    private String name;
    private List<Answer> answers;

    public QuestionForCollectionNonStringObject(int id, String name, List<Answer> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + " : " + name);
	System.out.println("answers are :: ");
	answers.forEach(System.out::println);
    }
}
