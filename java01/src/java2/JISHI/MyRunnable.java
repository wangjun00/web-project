package java2.JISHI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		 Class clazz=ChengFa.class;
	        // 调用TestReflect类中的reflect1方法
	        Method method;
			try {
				method = clazz.getMethod("run1");
				method.invoke(clazz.newInstance());
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
