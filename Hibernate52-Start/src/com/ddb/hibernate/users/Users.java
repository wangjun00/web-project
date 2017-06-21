package com.ddb.hibernate.users;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Users {
	private Long id;
	private String name;
	private String pass;
	
	public  Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(Long id, String name, String pass) {
		
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}

	
	
}
