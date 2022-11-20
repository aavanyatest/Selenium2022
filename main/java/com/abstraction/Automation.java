package com.abstraction;

public class Automation extends MultipleLanguage {

	public void selenium() {
		System.out.println("Selenium class");
	}

	public void java() {
		System.out.println("Java Language");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public static void main(String[] args) {

		Automation aut = new Automation();
		aut.selenium();
		aut.java();
		aut.ruby();

		aut.python();

	}

}
