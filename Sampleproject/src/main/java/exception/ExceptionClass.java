package exception;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       int a=8;
       int b=0;
       int c= a/b;
       System.out.println(c);
       }
		catch(ArithmeticException ae) {
			
			System.out.println("Exception is handled");
		}
		
		finally {
			
			System.out.println("Important code ");
		}
		//System.out.println("after finally");
		try {
		int a[]= {2,3,4};
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			
			System.out.println("Array exception handling");
		}
		try {
		
		String a=null;
		System.out.println(a.length());
		}
		catch(NullPointerException obj){
			System.out.println("Null exception handling");
			
		}
		
     
	}

}
