package lab_Date_Time;

import java.text.ParseException;

public class Tester {

	public static void main(String[] args) throws ParseException {
		Person person = new Person("nely", "calderon", "2002/01/01"); 
		
		System.out.println("full name: " + person.getFullName());
		int age = person.getAge();
		if (age == -1) {
			System.out.println("error occurred...");
		} else {
			System.out.println("age: " + age);
		}
	}

}
