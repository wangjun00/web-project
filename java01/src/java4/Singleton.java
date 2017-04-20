package java4;

public class Singleton{
	
	public static Singleton instance =null;

	private Singleton (){
		System.out.println("构造函数执行...");
	}
		
		public static Singleton getInstance(){
			if (instance==null){
				instance=new Singleton();
			}
			
			
			return instance;
		

	}

}