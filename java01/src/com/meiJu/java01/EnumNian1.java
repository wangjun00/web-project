package com.meiJu.java01;


public enum EnumNian1 {
//	CUNTIAN,   XIATIAN,  QIUTIAN,  DONGTIAN
	CUNTIAN("清爽","春天"), XIATIAN("炎热","夏天"), XIUTIAN("忙碌","秋天"), DONGTIAN("寒冷","冬天");
	
	
	private String hot;
	private String tian;
	
	private EnumNian1(String hot,String tian){
		this.hot=hot;
		this.tian=tian;
	
	}

	@Override
	public String toString() {
		return super.toString();
	}
	public String  getInfo(){
		
		return "是一个"+this.hot+this.tian;
		
		
	}
	
	
	
	
	
}