package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	
public SuperConstructorChild() {
	
		super();
		System.out.println("welocme");
	}
	
public SuperConstructorChild(int a,float b) {
     
	
	super(5,4);
	System.out.println(a/b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj =new SuperConstructorChild();
		//SuperConstructorParent obj1= new SuperConstructorParent();
		SuperConstructorChild obj3 = new SuperConstructorChild(1,3.5f);
	}

}
