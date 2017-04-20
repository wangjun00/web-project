package JiHe;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("中");
		list.add("华");
		list.add("人");
		list.add("民");
		list.add("共");
		list.add("和");
		list.add("国");
		list.add("国");

//     	System.out.println(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
			
		list.add(0,"我");
		list.add(1,"爱");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove(9);
		for (String string : list) {
			System.out.println(string);
		}
		
//		list.get(9);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		
		}
		
		
		
	}


