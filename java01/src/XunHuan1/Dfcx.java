package XunHuan1;

import java.util.Scanner;

public class Dfcx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入三角形的高:");
		int num = input.nextInt();/* 改变num的参数，改变 三角形的高 */
		System.out.println("请输入三角形平移的位置:");
		int y = input.nextInt(); /* 改变x的参数，改变三角形位置平移 */
		//java.util.InputMismatchException输入的数不能是字母
		
			//int num= 5;
		    //int y = 1;
		
		for (int i =0; i < num+1; i++) {
						//0<5:	-----
						//1<5	----
						//2<5	---
						//3<5	--
						//4<5	-
						/* 5<5  false终止*/
			   System.out.print(" ");
			for (int x = y; x <= num; x++) {
				// x=1   1<=5-0		-----
				// X=2   2<=5-1		---
				// x=3   3<=5-2		-
				//
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i+1 ; ++j) {
							//1<=2*0+1:1<=1		 *
	                        //1<=2*1+1:1<=3		***		
							//1<=2*2+1:1<=5	   ** **
							//				  **   **
							//			     *********
				if(j==1||j==2*i+1){			/*如果j=1或j=2*i*/
										//如果取j的最小值j=1；或者j的最大值j=2*i。
					System.out.print("*");
									//打印出最大值和最小值
				}	else			
				System.out.print(" ");
			}
			System.out.println();
			for(int k=1;k<2*(num+2);k++){
				System.out.print("*");
        }

		
	}

	}
}

