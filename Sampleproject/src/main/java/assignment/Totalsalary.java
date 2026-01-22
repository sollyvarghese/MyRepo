package assignment;

public class Totalsalary extends CalculateHraandPf {
	
	
	double totalsalary;
	
	public void calculate2() {
		
		totalsalary = (basicPay + hra - pf - deduction + bonus);
		//System.out.println(totalsalary);
		
	}

}
