package java01;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		if (input.hasNextInt()) { // 如果输入的除数是整数
			System.out.print("请输入除数:");
			int num1 = input.nextInt();
			if (0 == num1) { // 如果输入的除数是0
				System.err.println("输入的除数是0，程序退出。");
				System.exit(1);
			}
		} else { // 如果输入的除数不是整数
			System.err.println("输入的除数不是整数，程序退出。");
			System.exit(1);
		}

		System.out.print("请输入被除数:");
		if (input.hasNextInt()) { // 如果输入的被除数是整数
			System.out.print("请输入被除数:");
			int num2 = input.nextInt();

			if (0 == num2) { // 如果输入的被除数是0
				System.err.println("输入的被除数是0，程序退出。");
				System.exit(1);
			}
		} else { // 如果输入的除数不是整数
			System.err.println("输入的被除数不是整数，程序退出。");
			System.exit(1);
			   
			
			System.out.println("算出的结果是：" +1);
		}

	}
}
