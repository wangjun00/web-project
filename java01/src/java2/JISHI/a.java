package java2.JISHI;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class a {
	public void run1() throws FileNotFoundException{
PrintStream p=new PrintStream("D://0000");
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= i; j++) {
			int sum = i * j;
			p.print(+j + "*" + i + "=" + sum + "\t ");
		}
		p.println();
}
}}