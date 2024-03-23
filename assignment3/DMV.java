// nely calderon // ncalderon24@toromail.csudh.edu

import java.util.ArrayList;
import java.util.Date;

public class DMV {
    String state; 
    ArrayList<Registration> registrations; 
    ArrayList<Citation> citations; 
    
    public DMV(String state) {
        this.state = state; 
        this.registrations = new ArrayList<Registration>();
        this.citations = new ArrayList<Citation>(); 
    }
    
    public void registerVehicle(Owner owner, DMV vehicle) {
        if(hasPendingCitations(vehicle)) {
            System.out.println("Cannot register vehicle, pending citations exist...");
            return; 
        }
        
        if(hasActiveRegistration(vehicle)) {
            System.out.println("Cannot register vehicle, it already has an active registration...");
            return; 
        }
        
        Registration newRegistration = new Registration(getUniqueID(), new Date(), owner, vehicle.getPlate()); 
        registrations.add(newRegistration); 
        System.out.println("Successfully registered vehicle!");
    }
    
    private boolean hasActiveRegistration(DMV dmv) {
        for(Registration regis : registrations) {
            if(regis.getVehicle().equals(dmv) && regis.getEndDate() == null) {
                return true; 
            }
        }
        return false;
    }
    
    private boolean hasPendingCitations(DMV dmv) {
        for(Citation cit : citations) {
            if(cit.getVehicle().equals(dmv) && cit.getStatus().equals("Pending")) {
                return true; 
            }
        }
        return false;
    }
    
    public void registerCitation(Date date, int offenceCode, double amount, String status, Registration vehicle) {
        boolean vehicleFound = false;
        
        for(Registration regis: registrations) {
            if(regis.getVehicle().equals(vehicle)) {
                vehicleFound = true; 
                break; 
            }
        }
        
        if(!vehicleFound) {
            System.out.println("Cannot find vehicle, therefore cannot register...");
            return; 
        }
        
        Citation newCitation = new Citation(date, offenceCode, amount, status, vehicle);
        citations.add(newCitation); 
        
        System.out.println("Successfully recorded citation c:");
    }
    
    public void listRegistrations() {
        System.out.println("All registrations: ");
        for(Registration regis : registrations) {
            System.out.println(regis);
        }
    }
    
    public void listCitations() {
        System.out.println("All citations: ");
        for(Citation cit : citations) {
            System.out.println(cit);
        }
    }
    
    public Registration searchRegistrationByPlate(String plate) {
        System.out.println("Registrations under " + plate + ": ");
        for(Registration regis : registrations) {
            if(regis.getPlate().equals(plate)) {
                System.out.println(regis);
                return regis; 
            }
        }
        return null; 
    }
    
    public void searchRegistrationByID(String uniqueID) {
        System.out.println("Registrations under " + uniqueID);
        for(Registration regis : registrations) {
            if(String.valueOf(regis.getUniqueID()).equals(uniqueID)) {
                System.out.println(regis);
            }
        }
    }
}
