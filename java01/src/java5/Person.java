package java5;

import java.sql.Statement;

import java2.StudenImpl;

public abstract class Person {
	// 普通的语句块
	{
		System.out.println("我是普通的语句块｛｝中内容");
	}
	// 静态的语句块
	static {
		System.out.println("我是static的语句块中内容");
	}
	// 静态属性
	static StudenImpl student = new StudenImpl();

	String name;
	int age;

	public Person() {
		super();
		System.out.println("Person 的无参构造函数被执行...");

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 的有参构造函数被执行...");
	}

}
