package assignment;

public class SalarySlip extends Totalsalary {
	
	
	public void dispalysalary() {
		
		
		System.out.println("\n--- Salary Slip ---");
		System.out.println("basic pay = " + basicPay);
		System.out.println("deduction = " + deduction);
		System.out.println("HRA =" + hra);
		System.out.println("PF = "+ pf);
		System.out.println("bonus = " + bonus);
		System.out.println("--------------------------");
		System.out.println("toatl Salary = "+ totalsalary);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		SalarySlip obj = new SalarySlip();
         obj.getDetails();
         obj.Calculate1();
         obj.calculate2();
         obj.dispalysalary();
	}

}
