package FanSe;

import java.lang.reflect.Field;
import java.util.Set;

import DuiXiang.Student;





public class Testperson{
	private static final Object Object = null;

	public static void main(String[]agr) throws Exception{
		Student student=new Student();
		System.out.println(student);
		
		Class c=Class.forName("DuiXiang.Student");
		Object o = c.newInstance();
		Field ageF = c.getDeclaredField("age");
		Student obj = (Student) c.newInstance();
		ageF.setAccessible(true);
		ageF.set(Object, 40);
		System.out.println(Object);
		System.out.println((Student)Object);
	}

}
