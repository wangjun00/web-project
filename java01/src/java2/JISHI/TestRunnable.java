package java2.JISHI;

import java2.JISHI.MyRunnable;

public class TestRunnable {
	/**
	 * 打印乘法口诀表到文件中。 要求： A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
	 * B.在另一个测试类中，创建一个实现Runnable接口的线程； C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
	 * D.启动线程，打印乘法口诀表到文件中！
	 **/

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

//		Runnable myRunnable = new MyRunnable(); // 创建一个Runnable实现类的对象
		Thread thread1 = new Thread(my); // 将myRunnable作为Thread

		thread1.start(); // 调用start()方法使得线程进入就绪状态

	}

}
