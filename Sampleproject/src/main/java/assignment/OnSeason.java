package assignment;

public class OnSeason {
	
	 public void discount(double amount) {
	        double discount = amount * 0.40; // 40% discount
	        double finalAmount = amount - discount;
	        System.out.println("Onseason Discount (40%) : " + discount);
	        System.out.println("Amount to Pay : " + finalAmount);
	    }

}
