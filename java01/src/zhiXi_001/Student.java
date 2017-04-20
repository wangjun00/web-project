package zhiXi_001;

public class Student {

	String name;
	int age;
	String classno;
	String hoppy;
	public Student(){
		//无参构造函数
	}
	public Student(String name){
	this.name=name;		//有参构造函数
	this.age=age;
	this.classno=classno;
	this.hoppy=hoppy;
	}
	public void show() {
		System.out.println("Student Name："+name+"  age:"+age+"  classno:"+classno+"   hoppy:"+hoppy);
	}
}
