package com.ZuSi.java01;



public class Person extends Teacher {
	private int age=22;
//	private String name="BBQ";
	public void display() {
		System.out.println(age);
		
	}
	public Person(String name, int age) {
		super(name, age);
		

	}
	

}
