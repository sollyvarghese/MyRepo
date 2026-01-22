package abstraction;

public abstract class AbstractClass {
	
	public abstract int display();
	public abstract int add(int a,int b);
	
		public void show() {
			System.out.println("hello");
			
		}
		
		
		public AbstractClass() {
			System.out.println("hi");
		}
		
		public AbstractClass(int a,int b) {
			int c=a+b;
			System.out.println("sum = "+c);
		}
		
	}


