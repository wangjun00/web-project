package java1;

import java.util.Arrays;
import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		/* 列出10个数 */
		int[] score;
		score = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数：");
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
		}
		/* 计算出这10个数的总和 */
		double total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("这10个数的和是:" + total);
		/* 计算出这10个数的平均值 */
		double avg = 0;
		for(int i = 0;i<score.length;i++){
			avg=(avg+=score[i])/10;
		}
		System.out.println("这10个数的平均数是:" + avg);
		
		/*这10个数中最大数*/
		double max=0;
		for(int i = 0;i<score.length;i++){
		 if(score[i]>max);
		 max=score[i];
		}
		System.out.println("这10个数中最大数是:" + max);
		
		Arrays.sort(score);
		System.out.println("把这10个数按升序排列：");
		for(int i = 0;i<score.length;i++){
			System.out.println(score[i]);
		}
		}
	}



