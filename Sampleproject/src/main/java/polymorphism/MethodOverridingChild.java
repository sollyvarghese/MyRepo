package polymorphism;

public class MethodOverridingChild extends MethodoverridingParent{
	
	public void show() {
		
		System.out.println("This is another instance method");
		super.show();
	}
	
	public void display(int a, int b) {
		int d=a-b;
		System.out.println("diff of 2 numbers = "+d);
		super.display(a,b);
		
		
	}
	

	@Override
	public void display1(int c, int d) {
		// TODO Auto-generated method stub
		int e=c/d;
		System.out.println("div ="+e);
		super.display1(5, 2);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		MethodOverridingChild obj = new MethodOverridingChild();
		obj.show();
		obj.display(10, 5);
		obj.display1(10, 10);

	}

}
