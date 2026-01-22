package inheritance;

public class MultilevelChild extends MultilevelIntermediate {
	
	public void sum() {
		int a = 10 ;
		int b = 20 ;
		int c= a+b;
		System.out.println("sum:"+c);
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MultilevelChild obj = new MultilevelChild();
		
		obj.sub();
		obj.division();
		obj.sum();

	}

}
