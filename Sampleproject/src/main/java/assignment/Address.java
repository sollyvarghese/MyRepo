package assignment;

public class Address {
	
	String Address;
	Student ref;
	
	public Address(String Address,Student ref) {
		
		
		this.Address=Address;
		this.ref=ref;
		
	}
	
	public void display() {
		System.out.println("Student Details");
		System.out.println("--------------");
		System.out.println("Student Name = " +ref.studentName);
		System.out.println("Student RollNo: " + ref.rollNo);
		System.out.println("Student Address = "+Address);

		
	}

	public static void main(String[] args) {
		
		
		
		Student obj=new Student("Soly",30);
		Address obj1=new Address("Dubai,UAE",obj);
		obj1.display();

	}

}
