package com.fanSe.java01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HuMan {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "HuMan [name=" + name + ", age=" + age + "]";
	}
	
	

}
