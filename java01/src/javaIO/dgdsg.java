package javaIO;

import java.util.Scanner;

public class dgdsg {
	public static void main(String[] args) {
		int num = -1;
		int y = -1;
		boolean isEx = false;
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入三角形的高：");
			try {
				num = input.nextInt();
				isEx =false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("输入格式错误！");
				isEx = true;
			}

		} while (isEx);
		Scanner input = new Scanner(System.in);
		System.out.println("请确定他的位置：");
		y= input.nextInt();

//		System.out.println(num);
//		System.out.println(y);
		

//		do {
//			Scanner input = new Scanner(System.in);
//			System.out.println("请输入三角形的高:");
//			try {
//				num = input.nextInt();
////				y = input.nextInt();
//				isEx = false;
//				}
//			catch (Exception e) {
//				System.out.println("请重新输入三角形的高:");
//				isEx = true;
//			}
//			while (isEx); 
//
//			System.out.println("请输入三角形平移的位置:");
//			try {
//				y = input.nextInt();
//				isEx = false;
//			} catch (Exception e) {
//				System.out.println("请重新输入三角形平移的位置:");
//			}
//		} while (isEx);
//System.out.println(num);
//System.out.println(y);
//		int size = num;
		for (int i = 1; i <= num; i++) {
			for (int j = y; j <= num - i; j++) {
				System.out.print("-"); /* j的参数表示三角形平移的位置 */
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == num)
					/* 如果i等于sice */
					System.out.print("#");
				else if (k == 1 || k == 2 * i - 1) // 计算三角形两条边
					/* （那如果k等于1或者k等于2乘i减1） */
					
					System.out.print("*");
				else
					System.out.print("+");
			}
			System.out.println();
	}
}}