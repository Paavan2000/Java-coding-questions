package com.kodnest.learing.staticprog;

import java.util.Scanner;

public class Bussiness {
	Scanner scan = new Scanner(System.in);
	int p;
	int t;
	static float r;
	float si;
	static {
		r = 2.0f;
	}

	public void giveinput() {
		System.out.println("Enter p");
		p = scan.nextInt();
		System.out.println("Enter t");
		t = scan.nextInt();
		System.out.println();
	}

	public void calculation() {
		si = (p * t * r) / 100;
	}

	public void display() {
		System.out.println("Simple Interest = " + si);
	}
}
