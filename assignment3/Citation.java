// nely calderon //ncalderon24@toromail.csudh.edu

import java.util.Date;

public class Citation {
    private Date date; 
    private int offenceCode; 
    private double amount; 
    private String status; 
    private Registration registration; 

    public Citation(Date date, int offenceCode, double amount, String status, Registration vehicle) {
        this.setDate(date); 
        this.setOffenceCode(offenceCode); 
        this.setAmount(amount);
        this.setStatus(status); 
        this.setRegistration(vehicle); 
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOffenceCode() {
        return offenceCode;
    }

    public void setOffenceCode(int offenceCode) {
        this.offenceCode = offenceCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registrations) {
        this.registration = registrations;
    }


    public char[] getCitationID() {

        return null;
    }

	public Object getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

    }
