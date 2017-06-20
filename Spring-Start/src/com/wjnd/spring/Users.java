package com.wjnd.spring;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {

	private String name;
	private String address;
	private String memo;
	private Integer age;
	@Override
	public String toString() {
		return "Users [name="+name+",address="+address+",memo="+memo+",age="+age+",]";
	}
	
	
	

}
