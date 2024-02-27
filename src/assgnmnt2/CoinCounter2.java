package assgnmnt2;
//nely calderon [ncalderon24@toromail.csudh.edu] 
public class CoinCounter2 {
	public  class CoinCounter{
	      //declare instance fields as necessary
			private int quarters; 
			private int dimes; 
			private int nickels; 
			private int pennies; 
			
	      //Constructor must be declared as follows
	      public CoinCounter(int quarters, int dimes, int nickels, int pennies){
	         //implement your code here
	    	  this.quarters = quarters;
	    	  this.dimes = dimes; 
	    	  this.nickels = nickels;
	    	  this.pennies = pennies; 
	      }

	      public int getDollarAmount(){
	       //  return dollar amount;
	    	 int totalCents = getTotalCents(); 
	    	 return totalCents / 100; 
	      }

	      public int getCentsAmount(){
	       //return cent amount;
	    	  int totalCents = getTotalCents(); 
	    	  return totalCents % 100; 
	      }
	      private int getTotalCents() {
	    	  return (this.quarters * 25) + (this.dimes * 10) + (this.nickels * 5) + (this.pennies); 
	      }
	}
}
