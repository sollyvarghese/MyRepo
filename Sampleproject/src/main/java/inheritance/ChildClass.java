package inheritance;

public class ChildClass extends SingleParent{
	public void mul() {

	int m = 10 ;
	int n = 20 ;
	int r= m*n;
	System.out.println("mul of 2 :"+ r);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.mul();
		obj.sum();

	}

}
