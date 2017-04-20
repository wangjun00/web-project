package javaIO;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
//		File f1 =new File("a.jpg");
	    File f2 =new File("D:/void1/");
	    
	    System.out.println("Name:"+f2.getName());
	    System.out.println("Path:"+f2.getPath());
	    System.out.println("Absoilutepath:"+f2.getAbsolutePath());
	    System.out.println("Parent:"+f2.getParent());
	    System.out.println("lastModified:"+new Date(f2.lastModified()));
	    System.out.println("length:"+f2.length());
	    System.out.println("exists:"+f2.exists());
	    System.out.println("canRead:"+f2.canRead());
	    System.out.println("canWrite:"+f2.canWrite());
	    System.out.println("isFile:"+f2.isFile());
	    System.out.println("isHidden:"+f2.isHidden());
	    System.out.println("isDirectory:"+f2.isDirectory());
	    System.out.println("isAbsolute:"+f2.isAbsolute());
	    System.out.println("length:"+f2.length());
//	    f2.delete();
	}

}
