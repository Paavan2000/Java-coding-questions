package com.kodnest.learing.staticprog;

public class Employee {
	int id;
	String name;
	static int count = 0;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		count++;
	}
}
