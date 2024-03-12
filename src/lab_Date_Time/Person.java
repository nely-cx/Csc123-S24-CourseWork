package lab_Date_Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
		private String fName; 
		private String lName;
		private String dob; 
		
		public Person(String fName, String lName, String dob) {
			this.fName = fName; 
			this.lName = lName; 
			this.dob = dob;
		}
		public String getFullName() {
			return fName + " " + lName; 
		}
		
		public int getAge(){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date currDate = new Date(); 
			Date dobDate; 
			try{
				dobDate = sdf.parse(dob); 
			} catch(ParseException e) {
				System.err.println("error changing dob: " + e.getMessage());
				return -1; 
			}
			
			long ageInMillis = currDate.getTime() - dobDate.getTime(); 
			long age = ageInMillis / (1000 * 60 * 60 * 24 * 365); 
			return (int) age; 
		}
}

