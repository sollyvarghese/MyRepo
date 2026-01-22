package assignment;

import java.util.Scanner;

public class Basicpay {
	
	
	 double basicPay;
     double deduction;
     double bonus;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    	
//    	
//    	basicPay = 5000;
//    	deduction = 500;
//    	bonus = 2000;
//    	
//    	System.out.println();
        
    }
	

}
