package com.fanSe.java01;

public class Man {
	String name;
	int age;
	
	public Man() {
		super();
	}
	public Man(String name) {
		super();
		this.name = name;
	}
	public Man(int age) {
		super();
		this.age = age;
	}
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}

}
