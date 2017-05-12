package java2.JISHI;

import java.lang.reflect.Method;

public class b implements Runnable {
	public void run(){
	Class c=a.class;
	
	Method method;
	try {
		method=c.getMethod("run1");
		method.invoke(c, newIntence());
	
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

	private Object newIntence() {
		// TODO Auto-generated method stub
		return null;
	}

}
