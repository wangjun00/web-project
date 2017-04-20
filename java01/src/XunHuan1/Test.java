package XunHuan1;

public class Test {

	public static void main(String[] args) {

		int ret = test1();
		System.out.println(ret);
	}

	public static int test1() {
		int a = 1;
		try {
			return a;
		} finally {
			 a++;
			System.out.println("a = " + a);
		}

	}

}
