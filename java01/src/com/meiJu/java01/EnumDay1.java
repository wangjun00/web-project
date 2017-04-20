package com.meiJu.java01;

import lombok.Getter;
import lombok.Setter;

public enum EnumDay1 {
	MON(1, "星期1"), TUR(  2, "星期2"), WED(3, "星期3"), THU(4, "星期4"), FRI(5, "星期5"), SAT(6, "星期6"), SUN(7, "星期7");

	int index;
	String desc;
//	public static final int DEMO = 0;

	private EnumDay1(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	public void print() {
		System.out.println("print:  " + this.index + "-----" + "this.desc");
	}
	public String getInfo(){
		return "第"+this.index+"天： "+"...."+this.desc;
		
	}
}
