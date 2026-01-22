package superkeyword;

public class SuperMethodOne extends SuperMethodParent{
	
	public void sum() {
		int a=5;
		int b=2;
		int c =a+b;
		System.out.println(c);
        super.display();
        this.displayTwo();
        
	}
	public void displayTwo() {
		System.out.println("hello solly");
		super.sub();	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SuperMethodOne obj1 = new SuperMethodOne();
      obj1.sum();
      //obj1.display();      
	}

}
