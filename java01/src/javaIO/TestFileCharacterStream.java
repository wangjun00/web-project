package javaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharacterStream {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("");
			FileWriter fw = new FileWriter("");
			int read = fr.read();
			while (read != -1) {
				fw.write(read);
				read = fr.read();
			}
			fr.close();
			fw.close();
			System.out.println("Copy Success!");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	{

	}
}
