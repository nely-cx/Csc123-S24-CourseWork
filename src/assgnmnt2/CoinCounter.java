// nely calderon (ncalderon24@toromail.csudh.edu)
package assgnmnt2;

import java.util.Scanner;

public class CoinCounter {
	private int quarters; 
	private int dimes; 
	private int nickels; 
	private int pennies; 
	
	public CoinCounter(int quarters, int dimes, int nickels, int pennies) {
		this.quarters = quarters; 
		this.dimes = dimes;
		this.nickels = nickels; 
		this.pennies = pennies; 
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("hello & welcome to coin counter c:");
		System.out.println("please provide the following info...");
		
		System.out.println("enter below the number of quarters: ");
			int quarters = input.nextInt(); 
			
		System.out.println("enter below the number of dimes: ");
			int dimes = input.nextInt(); 
			
		System.out.println("enter below the number of nickels: ");
			int nickels = input.nextInt(); 
			
		System.out.println("enter below the number of pennies: ");
			int pennies = input.nextInt(); 
		
		CoinCounter coinCounter = new CoinCounter(quarters, dimes, nickels, pennies);
			coinCounter.printTotal(); 
		
		input.close(); 
	}

	private void printTotal() {
		double total = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies); 
		System.out.printf("your total is: $%.2f%n", total);
	}
	
	public int getDollarAmount() {
		//have to cast to int
		return (int) ((0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies));
	}
	
	public int getCentsAmount() {
		//have to cast int to it as well
		return (int)(((0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies)) * 100 % 100);
	}

}
