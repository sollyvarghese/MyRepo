package abstraction;

public class ChildAbstract extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClass obj2= new ChildAbstract();
		ChildAbstract obj = new ChildAbstract();
		ChildAbstract obj2 = new ChildAbstract(5,5);
		System.out.println(obj.display());	
		System.out.println(obj.add(2, 4));	
		obj.show();
		obj.sub();
		
		// we cannot access child class property by createing parent class object or parent class reference 

		//reference creation 
		
		AbstractClass obj1= new ChildAbstract();
		AbstractClass obj3= new ChildAbstract(5,5);
		System.out.println(obj1.display());
		System.out.println(obj1.add(2,4));
		obj1.show();
		//obj1.sub();
	}
	
	public ChildAbstract(int a, int b) {
		
		super(5, 4);
		
	}
	

	public ChildAbstract() {
		//automaticaly first call for parent constructor so no need for super for calling 
		//super();
	}

	@Override
	public int display() {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int sum =a+b;
		return sum;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		
		int total = a+b;
		return total;
		
		
	}
	
	public void sub() {
	int a=3;
	int b=1;
	int sub=a-b;
	System.out.println("sub ="+sub);
	
	}

}
