package java1;

import java.util.Scanner;

import javax.swing.InputVerifier;

public class ff {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("stb的成绩是：");
		int stb=input.nextInt();
		
		System.out.println("java的成绩是：");
		int java=input.nextInt();
		
		System.out.println("sql的成绩是：");
		int sql=input.nextInt();
	
	    int diffen;
	    double acg;
	    diffen=(java-sql);
	    System .out.println("JAVA和SQL的分数差是："+diffen);
	    acg=((stb+java+sql)/3);
	    System .out .println("3门课的平均分是："+acg);
	    
	}

}
