
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainTester {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        DMV dmv = new DMV("Nevada");

	        while (true) {
	            System.out.println("main menu: ");
	            System.out.println("1: register vehicle");
	            System.out.println("2: register citation");
	            System.out.println("3: list all registrations");
	            System.out.println("4: list all citations");
	            System.out.println("5: list all registrations for a vehicle");
	            System.out.println("6: list all registrations for a person");
	            System.out.println("7: list all citations for a vehicle");
	            System.out.println("8: list all citations for a person");
	            System.out.println("0: exit the program");

	            System.out.print("please pick a choice listed above...");
	            int choice = input.nextInt();
	            input.nextLine();

	            switch (choice) {
	                case 0:
	                    System.out.println("now exiting...");
	                    System.exit(0);
	                    break;

	                case 1:
	                   
	                    registerVehicle(input, dmv);
	                    break;

	                case 2:
	                 
	                    registerCitation(input, dmv);
	                    break;

	                case 3:
	                    dmv.listRegistrations();
	                    break;

	                case 4:
	                    dmv.listCitations();
	                    break;

	                case 5:
	                    System.out.print("Enter vehicle plate number: ");
	                    String plateNumber = input.nextLine();
	                    dmv.searchRegistrationByPlate(plateNumber);
	                    break;

	                case 6:
	                    System.out.print("Enter owner's ID: ");
	                    String ownerId = input.nextLine();
	                    dmv.searchRegistrationByID(ownerId);
	                    break;

	                case 7:
	                    System.out.print("Enter vehicle plate number: ");
	                    String plateNumberForCitation = input.nextLine();
	                    dmv.registerCitation(new Date(), choice, choice, plateNumberForCitation, null);
	                    break;

	                case 8:
	                    System.out.print("Enter owner's ID: ");
	                    String ownerIdForCitation = input.nextLine();
	                    dmv.registerCitation(new Date(), choice, choice, ownerIdForCitation, null);
	                    break;

	                default:
	                    System.out.println("invalid choice, please try again...");
	                    break;
	            }
	        }
	    }

	   
	    private static void registerVehicle(Scanner input, DMV dmv) {
	       
	        System.out.print("Enter owner's first name: ");
	        String firstName = input.nextLine();
	        System.out.print("Enter owner's last name: ");
	        String lastName = input.nextLine();
	        System.out.print("Enter owner's address: ");
	        String address = input.nextLine();
	        System.out.print("Enter owner's city: ");
	        String city = input.nextLine();
	        System.out.print("Enter owner's state: ");
	        String state = input.nextLine();
	        System.out.print("Enter owner's zip: ");
	        String zip = input.nextLine();

	        Owner owner = new Owner(firstName, lastName, address, city, state, zip);

	        System.out.print("Enter vehicle VIN: ");
	        String vin = input.nextLine();
	        System.out.print("Enter vehicle make: ");
	        String make = input.nextLine();
	        System.out.print("Enter vehicle model: ");
	        String model = input.nextLine();
	        System.out.println("Enter vehicle color: ");
	        String color = input.nextLine();
	        System.out.println("Enter vehicle number of doors: ");
	        int numOfDoors = input.nextInt();
	        input.nextLine(); 

	        System.out.print("Enter vehicle plate number: ");
	        String plateNumber = input.nextLine();

	        Date dateOfMfg = new Date();

	        Vehicle vehicle = new Vehicle(vin, dateOfMfg, make, model, color, numOfDoors);
	        dmv.registerVehicle(owner, vehicle);
	    }

	    
	    private static void registerCitation(Scanner input, DMV dmv) {
	        System.out.print("Enter citation date (YYYY-MM-DD): ");
	        String dateString = input.nextLine();

	        System.out.print("Enter offence code: ");
	        int offenceCode = input.nextInt();
	        input.nextLine(); 
	        System.out.print("Enter citation amount: ");
	        double amount = input.nextDouble();
	        input.nextLine(); 
	        System.out.print("Enter citation status: ");
	        String status = input.nextLine();

	        System.out.print("Enter vehicle plate number: ");
	        String plateNumber = input.nextLine();
	       
	        Registration registration = dmv.searchRegistrationByPlate(plateNumber);

	        dmv.registerCitation(new Date(), offenceCode, amount, status, registration);
	    }
	}

