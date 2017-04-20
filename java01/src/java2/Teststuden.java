package java2;

public class Teststuden {

	public static void main(String[] args) {
		Studen studen=new StudenImpl();
		studen.study();
		studen.studyjava("java");
        studen.studyjava("php");
        studen.studyjava("ui");
	}

}
