//nely calderon (ncalderon24@toromail.csudh.edu)
package assngmnt2_p2;
import java.util.*; 

public class ChangeMaker {
	private int quarters; 
	private int dimes; 
	private int nickels; 
	private int pennies; 
	
	public ChangeMaker(int dollars, int cents) {
		calcChange(dollars, cents);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int dollars, cents; 
		
		while (true) {
			System.out.println("please enter the amount of dollars below: ");
				dollars = input.nextInt();
				
			System.out.println("now please enter the amount of cents below: ");
				cents = input.nextInt(); 
				
			if (dollars >= 0 && cents >= 0) {
				break; 
			}
			System.out.println("please enter a value that isn't negative...");
			
			input.close(); 
		}
		
		ChangeMaker changeMaker = new ChangeMaker(dollars, cents); 
		
		System.out.println("number of quarters: " + changeMaker.getQuarters());
		System.out.println("number of dimes: " + changeMaker.getDimes());
		System.out.println("number of nickels: " + changeMaker.getNickels());
		System.out.println("number of pennies: " + changeMaker.getPennies());
	}
	
	public void calcChange(int dollars, int cents) {
		if (dollars < 0 || cents < 0 ) {
			System.out.println("please make sure the value you enter is not negative...");
			return; 
		}
		int totalCoins = (dollars * 100) + cents; 
		
		quarters = totalCoins / 25; 
		totalCoins %= 25;
		
		dimes = totalCoins / 10; 
		totalCoins %= 10; 
		
		nickels = totalCoins / 5; 
		totalCoins %= 5; 
		
		pennies = totalCoins; 
	}
	
	public int getQuarters() {
		return quarters; 
	}
	
	public int getDimes() {
		return dimes; 
	}

	public int getNickels() {
		return nickels; 
	}
	
	public int getPennies() {
		return pennies; 
	}
}
