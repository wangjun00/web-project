package java1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
	Scanner input=new Scanner(System .in);
	System.out.println("请输入一个数：");
	int num=input.nextInt();
	
	for(int i=0;i<=num;i++){
		System.out.println("*");
		for(int j =0;j<=num;j++){
			System.out.println("**");
			for(int a=0;a<=num;a++){
				System.out.println("***");
			}
		}
		
		
	}
	
	}

}
