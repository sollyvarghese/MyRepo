package assignment;

public class EncapsulationBank {
	
	private int pin;

	

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
//	public int getPin() {
//		return pin;
//	}
	
	public void validatePin() {

        //int enteredPin = getPin(); // using getter

        if (pin == 1001 || pin == 1234 || pin == 1212) {
            System.out.println("PIN validated successfully.");
            withdrawAmount();
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
	}
     // withdrawal logic
        private void withdrawAmount() {
            System.out.println("Amount withdrawn successfully.");
        }
    
	
	
	

	
	
}
