package java1;

import org.omg.CORBA.PRIVATE_MEMBER;

public class D {
	private String name="杰克";
	private int age=20;
	private boolean married=true;
/*
 * 无参构造函数
 */
public D(){
		
}
/*
 * 有参构造函数
 */
	private D(String str,int i,boolean fla){
		name=str;
		age=i;
		married=fla;
	}
	public void display(){
		System.out.println(name+"  "+age+"  "+married );
	}
	
		public static void main(String[]args){
			
			
/*
 * 不使用引用类型
 */
		System .out.println("不使用引用变量的方式:");
			 String name="杰克";
			 int age=20;
			 boolean married=true;
		System.out.println(name+"  "+age+"  "+married );
		
			
   /*
    *使用引用类型 
    */
		System.out.println("使用引用变量的方式:");
		D d=new D("珍妮",20,married);
	    d.display();
		
		
		
	
	}
	
	
	
	

}
