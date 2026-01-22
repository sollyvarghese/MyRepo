package interfacePackage;

public class ChildClass2 implements MultipleParent1,MultipleParent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass2 obj=new ChildClass2();
		obj.display();
		obj.sum();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		System.out.println(a+b);
	}

}
