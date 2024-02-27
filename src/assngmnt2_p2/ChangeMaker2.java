//package assngmnt2_p2;
// nely calderon [ncalderon24@toromail.csudh.edu] 
public class ChangeMaker2 {

	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	// declare instance fields as necessary

	// Constructor must be declared as follows

	public ChangeMaker2(int dollars, int cents) {
		// implement your code here
		int total = dollars * 100 + cents; 
		
		
		quarters = total / 25; 
		total %= 25; 
		
		dimes = total / 10; 
		total %= 10; 
		
		nickels = total / 5; 
		total %= 5;
		
		pennies = total; 
	}

	public int getQuarters() {
		// return number of quarters
		return quarters;
	}

	public int getDimes() {
		// return the number of dimes
		return dimes;
	}

	public int getNickles() {
		// return number of nickels
		return nickels;
	}

	public int getPennies() {
		// return number of pennies
		return pennies;
	}

}