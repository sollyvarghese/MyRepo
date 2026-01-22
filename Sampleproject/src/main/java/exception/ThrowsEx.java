package exception;

public class ThrowsEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int age=16;
		if (age>18){
			
			
			System.out.println("eligible for voting");
		}
		else {
			throw new Exception("Not eligble");
		}
			

	}

}
