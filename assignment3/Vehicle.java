// nely calderon // ncalderon24@toromail.csudh.edu

import java.util.Date;

public class Vehicle {
    private String vin; 
    private Date dateOfMfg; 
    private String make; 
    private String model; 
    private String color; 
    private int numOfDoors; 

    public Vehicle(String vin, Date dateOfMfg, String make, String model, String color, int numOfDoors) {
        this.setVin(vin); 
        this.setDateOfMfg(dateOfMfg); 
        this.setMake(make); 
        this.setModel(model); 
        this.setColor(color); 
        this.setNumOfDoors(numOfDoors); 
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getDateOfMfg() {
        return dateOfMfg;
    }

    public void setDateOfMfg(Date dateOfMfg) {
        this.dateOfMfg = dateOfMfg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getPlate() {
        // TODO Auto-generated method stub
        return null;
    }
}
