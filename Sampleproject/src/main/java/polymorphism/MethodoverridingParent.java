package polymorphism;

public class MethodoverridingParent {

	
	public void show() {
		System.out.println("This is an instance method");
	}
	
	public void display(int a,int b) {
		
		int sum = a+b;
		System.out.println("Sum of 2 numbers ="+sum);
		
	}
public void display1(int c,int d) {
		
		int mult = c*d;
		System.out.println("mult of 2 numbers ="+mult);
		
	}
	
	
}
