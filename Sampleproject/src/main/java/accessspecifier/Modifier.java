package accessspecifier;

public class Modifier {
	
	
	public void pubmethod() {
		System.out.println("this a public method");
		
	}
	private void privatemethod() {
		
		System.out.println("this a private method");

	}
	 void defaultmethod() {
		
		 System.out.println("This is a default method");
	}
	protected void protectmethd() {
		System.out.println("this a protected method");

	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Modifier obj=new Modifier();
		obj.pubmethod();
		obj.privatemethod();
		obj.defaultmethod();
		obj.protectmethd();
		
		

	}

}
