package XunHuan1;

import java.time.Year;
import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("这是考试你合格了么：（n/y）");
		String answer = input.next();
		while (!"y".equals(answer)) {

			System.out.println("上午看java教材 ！");
			System.out.println("中午练习编程！y");

			answer = input.next();

		}
		System.out.println("完成学习任务！");

	}
}