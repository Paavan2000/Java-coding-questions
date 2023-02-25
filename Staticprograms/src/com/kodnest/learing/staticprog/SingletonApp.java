package com.kodnest.learing.staticprog;

public class SingletonApp {
	public static void main(String[] args) {
		Primeminister modi=Primeminister.getobject();
		Primeminister gandi=Primeminister.getobject();
		System.out.println(modi);
		System.out.println(gandi);
	}
}
