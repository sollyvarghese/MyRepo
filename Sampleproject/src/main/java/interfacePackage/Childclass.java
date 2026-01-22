package interfacePackage;

public class Childclass implements ParentInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentInterface obj= new Childclass();
		obj.dispaly();
		System.out.println(a);
		obj.show();
		ParentInterface.sum();
		
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		//b=70; final value cannot be changed
	}

}
