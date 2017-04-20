package com.fanSe.java01;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflection {
	@Test
	public void test2() throws Exception {
		Class<Person> clazz = Person.class;// clazz类可以访问并调用Person类的所有属性和方法

		// 1.创建clazz对应的运行时类Person类的对象
		Person p = (Person) clazz.newInstance();
		System.out.println(p);

		// 2.通过反射调用运行时类的指定属性(1.public/2.private)
		// 1:public属性没有被私有化时的调用(name/age)
		/*
		 * Field f1=clazz.getField("name"); f1.set(p, "大胖");
		 * System.out.println(p);
		 * 
		 * Field f2=clazz.getField("age"); f2.set(p, 18); System.out.println(p);
		 */
		// 2.private属性被私有化时的调用(name/age)
		Field f1 = clazz.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(p, "大胖");
		System.out.println(p);

		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(p, 18);
		System.out.println(p);

		// 3.通过反射调用运行时类的指定方法
		Method m1 = clazz.getMethod("show");
		m1.invoke(p, null);

	
		Method m2 = clazz.getDeclaredMethod("display",String.class );
		m2.invoke(p ,"中国");	
	}
}
