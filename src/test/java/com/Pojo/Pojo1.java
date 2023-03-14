package com.Pojo;

public class Pojo1 {

	// Declare The Element as Private

	// Generate getters and Setters

	// * getter ---> To Get the Value or Element
	// * Setter ===> to set the Value Of Element

	private int age; // 19
	private String name;

	public int getAge() {
		System.out.println(age + 20);
		return age;
	}

	public void setAge(int a) {

		age = a;

	}

	public String getName() {
		System.out.println("USER " + name);
		return name;
	}

	public void setName(String name) {

		this.name = name;

	}

}
