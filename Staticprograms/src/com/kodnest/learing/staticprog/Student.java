package com.kodnest.learing.staticprog;

import java.util.Scanner;

public class Student {
	static int id;
	static String name;
	static String gender;
	static int marks;
	static int sem;
	static Student s = null;
	static Scanner scan = new Scanner(System.in);

	private Student(int id, String name, String gender, int marks, int sem) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		this.sem = sem;
	}

	static public void eat() {
		System.out.println(name + " is eating");
	}

	static public void sleep() {
		System.out.println(name + " is sleeping");
	}

	static public void study() {
		System.out.println(name + " is studying");
	}

	public static Student getstudent() {
		if (s == null) {
			System.out.println("Enter id,name,gender,marks,sem");
			s = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
		}
		return s;
	}
}
