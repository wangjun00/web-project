package java1;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// int[] scores={89,79,76};
		// double avg;
		// avg=(score[0]+score[1]+scores[2])/3;
		int[] scores = new int[5];

		int sum = 0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
			sum = sum + scores[i];	
	
		System.out.println("平均指是："+sum/scores.length );
		

	}
//
	}}
