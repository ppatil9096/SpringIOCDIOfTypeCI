package com.pravin.spring.di.bean;

public class EmpForDependentObject {
    private int id;
    private String name;
    /**
     * dependent object
     */
    private Address address;// Aggregation

    public EmpForDependentObject(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
    }

    public EmpForDependentObject(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    public void show() {
	System.out.println(id + " " + name);
	System.out.println(address.toString());
    }
}
