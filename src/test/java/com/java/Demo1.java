package com.java;

public class Demo1 {

	int a;

	private Demo1() {
		System.out.println("Heloo");
		System.out.println(" how Are You!!!");
	}

	public int Name1() {

		int b = 20;
		a=b;
		System.out.println(a);

		return a;
	}

	public void Age1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
	
		d.Name1();
		d.Age1();

	}

}
