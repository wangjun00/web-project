package MapKV;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class TestGenerics1 {

	public static void main(String[] args) {
		HashMap<Integer, String>persons=new HashMap<Integer,String>();
		persons.put(1, "Jack");
		persons.put(2, "Rose");
		persons.put(3, "Mike");
		String name3=persons.get(1);
		System.out.println("The No.3 is :"+name3);
		
	}

}
