package zhiXi_001;

import java.util.Date;

public class 常用类 {

	public static void main(String[] args) {
		char[] a = { 'h', 'e', 'l', 'l', 'o', 'w' };
		String b = new String(a);// 将字符数组转换至字符串
		System.out.println(b);
		System.out.println("上述字符串的长度是： "+b.length());
System.out.println("----------------------------------------------------------------------");
		StringBuilder s = new StringBuilder("欢迎来到：");
		s.append("安徽");// 将指定的字符串追加到指定字符串里
		s.append("合肥市");
		// s.reverse();//反转取代
		System.out.println(s);
		System.out.println("上述字符串的长度是： "+s.length());
		
		System.out.println(s.charAt(4));
System.out.println("----------------------------------------------------------------------");
		String string0="我爱";
		String string1="我爱";
		String string2="中华";
		String string3="人民共和国";
		System.out.println(string0.compareTo(string1));	/*如果此字符串大于字符串参数，则返回一个大于 0 的值。
		如果参数字符串等于此字符串，则返回值 0；如果此字符串小于字符串参数，则返回一个小于 0 的值；*/
		System.out.println(string1.concat(string2)+string3);//连接字符串
System.out.println("----------------------------------------------------------------------");		
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isDigit('5'));
		char i='s';
		System.out.println(Character.toString(i));/*toString() 方法用于返回一个表示指定 char 
		值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。*/
System.out.println("----------------------------------------------------------------------");	
		Date date=new Date();
		System.out.println(date.toString());
		System.out.println(date);
		
		System.out.println(date.getTime());
	}

}
