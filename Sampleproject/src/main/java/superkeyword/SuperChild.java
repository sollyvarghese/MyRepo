package superkeyword;

public class SuperChild extends Superparent{

	
	String color="red";
	public void display() {
		
		System.out.println(super.color);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChild obj1= new SuperChild();
		System.out.println(obj1.color);
        obj1.display();
	}

}
