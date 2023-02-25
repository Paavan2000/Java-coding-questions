package com.kodnest.learing.staticprog;

public class Example1 {
	// static variable
	static int x;
	static int y;
	static int z;

	// static block
	static {
		x = 100;
		y = 200;
		z = 300;
	}

	// static methods
	static public void display1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	// Instance variable
	int a;
	int b;
	int c;

	// Instance block
	{
		a = 400;
		b = 500;
		c = 600;
		x = 700;
		y = 800;
		z = 900;
	}

	// Instance method
	public void display2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
