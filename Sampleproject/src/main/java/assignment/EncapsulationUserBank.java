package assignment;

import java.util.Scanner;

public class EncapsulationUserBank {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int userPin = sc.nextInt();
        
		EncapsulationBank obj=new EncapsulationBank();
         obj.setPin(userPin);
         obj.validatePin();

	}

}
