package java01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个要除的数：");
		
			
			try {
				int sum1=input.nextInt();
				int sum2=input.nextInt();
				System.out.println("算出的结果是："+sum1/sum2);
				
			} catch (ArithmeticException e) {
				e.getClass().getName();
				System.out.println("发现ArithmeticException异常！");
				e.printStackTrace();
				
			}catch (InputMismatchException ea) {
				ea.getClass().getName();
				
			System.out.println("发现InputMismatchException异常！");
			ea.printStackTrace();
			
		}catch (Exception ea) {
			ea.getClass().getName();
			
		System.out.println("发现异常！");
		ea.printStackTrace();}
			//InputMismatchException	
			//ArithmeticException
			System.out.println("运行到此，已经结束了！");
			

	
	}

}
