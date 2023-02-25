package com.kodnest.learing.staticprog;

public class Primeminister {
	static Primeminister pm = null;

	private Primeminister() {

	}

	static public Primeminister getobject() {
		if (pm == null) {
			pm = new Primeminister();
		}
		return pm;
	}

}
