package encapsulation;

public class EncapsulationChild2 {

	public static void main(String[] args) {
		
		
		EncapsulationParent1 obj=new EncapsulationParent1();
		obj.setName("Test");
		obj.setPinno(1099);
		System.out.println(obj.getName());
		System.out.println(obj.getPinno());

	}

}
