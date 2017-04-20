package JiHe;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
    
	TreeSet<Student1> treeSet=new TreeSet<Student1>();
	
	treeSet.add(new Student1("NM01", 19));
	treeSet.add(new Student1("NM02", 39));
	treeSet.add(new Student1("NM03", 29));
	treeSet.add(new Student1("NM04", 49));
		
	
	System.out.println("treeSet:"+treeSet);
	
	
	
	}

}
