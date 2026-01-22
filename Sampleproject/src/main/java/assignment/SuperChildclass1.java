package assignment;

public class SuperChildclass1 extends SuperParentClass1{
	
	
	
	public void division() {
		int sum = super.sum();		
		
		if (sum % 10 == 0) {
            System.out.println("The number is divisible by 10");
            
        } else {
            System.out.println("The number is NOT divisible by 10");
        }
	}

	public static void main(String[] args) {
		
		SuperChildclass1 obj = new SuperChildclass1();
		obj.division();
	}

}
