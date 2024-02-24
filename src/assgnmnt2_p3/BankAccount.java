// nely calderon (ncalderon24@toromail.csudh.edu)
package assgnmnt2_p3;
import java.util.*; 

public class BankAccount {
	private String ownerFirstN;
	private String ownerLastN; 
	private double balance; 
	private boolean isOpen; 
	
	public BankAccount(String ownerFirstN, String ownerLastN, double initialDepositAmt) {
		this.ownerFirstN = ownerFirstN; 
		this.ownerLastN = ownerLastN; 
		this.balance = initialDepositAmt; 
		this.isOpen = true; 
	}
	
	public boolean deposit(double amt) {
		if (isOpen && amt > 0) {
			balance += amt; 
			return true; 
		}
		return false;
	}
	
	public boolean withdraw(double amt) {
		if (isOpen && amt > 0 && balance >= amt) {
			balance -= amt; 
			return true; 
		}
		return false;
	}
	
	public void close() {
		isOpen = false; 
	}
	
	public String getOwnerFullName() {
		return ownerFirstN + " " + ownerLastN; 
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public boolean isOpen() {
		return isOpen; 
	}
	
	public boolean withdrawRemainingBal() {
		if(!isOpen && balance > 0) {
			balance = 0; 
			return true; 
		}
		return false; 
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount acc = new BankAccount("nely", "calderon", 8080);
		System.out.println("welcome, " + acc.getOwnerFullName() + " c:");
		
		while(true) {
			System.out.println("please choose one of the following options below: ");
			System.out.println("1. deposit");
			System.out.println("2. withdraw");
			System.out.println("3. view balance");
			System.out.println("4. close an account");
			System.out.println("5. withdraw remainging balance (acc closed)");
			System.out.println("6. exit");
			
			int choice = input.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("enter the amount you'd like to deposit: ");
						double depositAmt = input.nextDouble(); 
						
					if (acc.deposit(depositAmt)) {
						System.out.println("deposit was successful. new balance in account: $" + acc.getBalance());
					} else {
						System.out.println("deposit has failed :c");
					}
					break;
				case 2:
					System.out.println("please enter the withdrawl amount: ");
						double withdrawlAmt = input.nextDouble(); 
						
						if(acc.withdraw(withdrawlAmt)) {
							System.out.println("withdrawl is successful c: new balance in account is: $" + acc.getBalance());
						} else {
							System.out.println("your withdrawl has failed :c");
						}
						break; 
				
				case 3:
					System.out.println("current balance is: $" + acc.getBalance());
					break; 
					
				case 4:
					acc.close();
					System.out.println("account has been closed...");
					break; 
					
				case 5: 
					if(!acc.isOpen()) {
						if(acc.withdrawRemainingBal()) {
							System.out.println("remaing balance has successfully been done c:");
						} else {
							System.out.println("withdrawl of remainging balance failed, nothing remains.");
						}
					} else { 
						System.out.println("account must be closed in order to withdraw remainging balance...");
					}
					break; 
					
				case 6: 
					System.out.println("exiting the program now...");
				
					input.close();
					System.exit(0);
					
				default: 
					System.out.println("that is an invalid choise, please try again");
			}
		}

	}

}
