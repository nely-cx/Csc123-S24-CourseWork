// package assgnmnt2_p3;

// nely calderon [ncalderon24@toromail.csudh.edu]
public class BankAccount2 {
	public class BankAccount{
//declare instance fields 
		private String ownerFirstName;
		private String ownerLastName; 
		private double balance; 
		private boolean isOpen; 
//must have at least the following constructor 
	    public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount){
	       //complete constructor implementation
	    	this.ownerFirstName = ownerFirstName; 
	    	this.ownerLastName = ownerLastName; 
	    	this.balance = initialDepositAmount; 
	    	this.isOpen = true; 
	    }

	    public boolean deposit(double amount){
	     //complete implementation, return true if deposit is successful 
	    	if (amount > 0 && isOpen) {
	    		balance += amount;
	    		return true; 
	    	}
	    	return false; 
	    }

	    public boolean withdraw(double amount){
	     //complete implementation, return true if withdrawal is successful 
	    	if (amount > 0 && amount <= balance && isOpen) {
	    		balance -= amount; 
	    		return true;
	    	}
	    	return false; 
	     }

	     public boolean isOpen(){
	      //return true if account is open
	    	 return isOpen; 
	     }

	     public void close(){
	      //close bank account
	    	 isOpen = false; 
	    	 balance = 0; 
	     }

	     public String getOwnerFullName(){
	      //return Account Honder's full name
	    	 return ownerFirstName + " " + ownerLastName;  
	      }

	}
}
