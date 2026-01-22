package interfacePackage;

public interface ParentInterface {
	
	public abstract void dispaly();
	public static final int a=5;
	int b=20;
	
   default  void show() {
	   
	   System.out.println("display");
   }
   public static  void sum() {
	   
	  
	  System.out.println(a+b); ;
   }
	
	
}
