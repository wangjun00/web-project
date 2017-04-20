package java1;

import java.util.Scanner;

public class G {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		double[] a;
		a = new double[6];
		a[0] = (double)0;
		a[1] = (double)199.9;
		a[2] = (double) 250.5;
		a[3] = (double) 300;
		a[4] = (double) 499;
		a[5] = (double) 100;
       System.out.println("序号"+"      "+"金额");
       double sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "     " +a[i]);
			sum=sum+=a[i];
		}
      System.out.println("总金额是："+sum);
		

	}
}
