package assignment;

public class OffSeason extends OnSeason{
	
	

	@Override
	public void discount(double amount) {
		// TODO Auto-generated method stub
		
		double discount = amount * 0.15; // 15% discount
        double finalAmount = amount - discount;
        System.out.println("Offseason Discount (15%) : " + discount);
        System.out.println("Amount to Pay : " + finalAmount);
    
		super.discount(amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OffSeason obj=new OffSeason();
		obj.discount(1000);
			
	}

}
