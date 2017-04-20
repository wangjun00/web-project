package JiHe;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(99);
		list.add(88);
		list.add(11);
		list.add(22);

		System.out.println(list);

		list.addLast(33);
		System .out.println("list.addLast(33):"+list);
	}

}
