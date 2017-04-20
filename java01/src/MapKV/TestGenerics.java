/**
 * 
 */
/**
 * @author Administrator
 *
 */
package MapKV;

import java.util.HashMap;

public class TestGenerics{
		public static void main(java.lang.String[]args){
			HashMap persons=new HashMap();
			persons.put(1, "Jack");
			persons.put(2, "Rose");
			persons.put(3, "Mike");
			String name3=(String)persons.get(1);
			System.out.println("The No.3 is :"+name3);
			
			
		}
		
		
	}