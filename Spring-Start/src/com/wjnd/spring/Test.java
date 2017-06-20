package com.wjnd.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;
		
	private static void print(Object object) {
		System.out.println(object);
	}
	
	public static void test1(){
		Users users=new Users();
		users.setName("Teacher");
		users.setAddress("hefei");
		users.setMemo("This is my first Spring project");
		print(users);
	}
	
	public static void test2(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Users users=(Users)ctx.getBean("users");
		print(users);
	}

	public static void test3(){
		ctx =new FileSystemXmlApplicationContext("applicationContext.xml");
		Users users=(Users)ctx.getBean("users1");
		print(users);
	}
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();

	}

}
