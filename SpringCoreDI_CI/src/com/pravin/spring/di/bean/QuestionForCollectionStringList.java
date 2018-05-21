package com.pravin.spring.di.bean;

import java.util.List;

/**
 * 
 * @author ppatil
 * @desc Bean with String collection
 */
public class QuestionForCollectionStringList {
    private int id;
    private String name;
    private List<String> answers;

    public QuestionForCollectionStringList(int id, String name, List<String> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + " " + name);
	System.out.println("answers are :: ");
	answers.forEach(System.out::println);
    }
}
