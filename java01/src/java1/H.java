package java1;

public class H {
	public static void main(String[] args) {

		// 对数组边声明，边赋值
		double[] score = { 1.9, 2.9, 3.4, 3.5 };

		// 打印所有数组元素
		for (int i = 1; i < score.length; i++) {

			System.out.println("元素" + i + "  " + score[i] + " ");
		}
		// 计算所有元素的总和
		double total = 0;       /*total总和*/
		for (int i = 1; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("所以元素的总和是： " + total);
		// 查找最大元素
		double max = score[0];     /*max最大*/
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max)
		  max = score[i];
		}
		System.out.println("所有元素中最大的是：" + max);
	}
}
