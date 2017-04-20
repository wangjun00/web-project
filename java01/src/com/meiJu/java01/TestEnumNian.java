package com.meiJu.java01;

import java.util.Scanner;

public class TestEnumNian {

	public static void main(String[] args) {
		for (EnumNian nian : EnumNian.values()) {
			System.out.println(nian);
		}
		for (EnumNian1 nian : EnumNian1.values()) {
			
			System.out.println(nian.name()+nian.getInfo());
		}
//		Scanner input=new Scanner(System.in);
//		System.out.println("请输入你要查询的天气：");
//		String num=input.next();
//		
		
		
		
		
	}}

	

