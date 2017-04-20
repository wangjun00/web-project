package com.fanSe.java01;

import java.awt.DisplayMode;

import zhiXi_001.ShowStudent;

@SuppressWarnings("unused")
public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		System.out.println("调用空参构造器!");
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show(){
		System.out.println("我是一個人！");
	}
	public void display(String nation){
		System.out.println("我的國籍是： "+nation);
	}
	@Override
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}


