package com.java;

public class PojoJava {

	int b;

	public void Name1(int a) {

		System.out.println(a);
		b = a;

	}

	public void Value() {
		System.out.println(b);
	}

	// this --> Current Class Object

	public static void main(String[] args) {
		PojoJava j = new PojoJava();
		j.Name1(20);
		j.Value();

	}

}
