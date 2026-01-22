package modifier2;

import accessspecifier.Modifier;

public class Modifier1 extends Modifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifier1 obj3 = new Modifier1();
		obj3.pubmethod();
		//obj3.privatemethod();
		//obj3.defaultmethod();
		obj3.protectmethd();
		Modifier obj=new Modifier();//(parent class object)
		obj.pubmethod();
		//obj.privatemethod();
		//obj.defaultmethod();
		//obj.protectmethd();// should be child class object
	}

}
