package MyServlet;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ChengFa {

	public void run1() throws FileNotFoundException {
		PrintStream p = new PrintStream("/MyLoginServlet");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i * j;
				p.print(+j + "*" + i + "=" + sum + "\t ");
			}
			p.println();

		}
	}

}
