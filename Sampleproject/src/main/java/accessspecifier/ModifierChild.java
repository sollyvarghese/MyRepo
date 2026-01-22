package accessspecifier;

public class ModifierChild extends Modifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifierChild obj1=new ModifierChild();
		obj1.pubmethod();
		//obj1.privatemethod();- outside the class not visible
		obj1.defaultmethod();
		obj1.protectmethd();
		

	}

}
