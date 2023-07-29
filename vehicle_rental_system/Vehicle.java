/**
 * Write a description of class Vehicle here.
 * 
 * @author (Rose Duwal,NP01CP4S220096)
 * @version(1.0.0)
 */
//Creating a class named Vehicle
public class Vehicle
{
    //Declaring the instance variable for the class
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    
    //Defining the parameterized constructor
    
    public Vehicle (int vehicleID, String vehicleName, String vehicleColor, String vehicleWeight){
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleColor= vehicleColor;
        this.vehicleWeight= vehicleWeight;
    }
    
    //getter method for vehicleID 
    public int getVehicle(){
        return this.vehicleID;
    }
    
    //getter method for VehicleName
    public String getVehicleName(){
        return this.vehicleName;
    }
    
    //getter method for VehicleColor
    public String getVehicleColor(){
        return this.vehicleColor;
    }
    
    //getter method for VehicleWeight
    public String getVehicleWeight(){
        return this.vehicleWeight;
    }
    
    //getter method for VehicleSpeed 
    public String getvehicleSpeed(){
        return this.vehicleSpeed;
    }
    
    //setter method for VehicleSpeed that sets vehiclespeed as new speed
    public void setVehicleSpeed(String newSpeed){
        this.vehicleSpeed=newSpeed;
    }
    
    //setter method for VehicleColor that sets vehicleColor as new VehicleColor
    public void setVehicleColor (String newColor){
        this.vehicleColor=newColor;
    }
    
    /*This method displays the output of each attribute with suitable annotations and lets the user know if vehicleWeight is 
     empty. */
    public void display(){
        System.out.println("vehicle ID: "+ this.vehicleID);
        System.out.println("vehicle Name: "+ this.vehicleName);
        System.out.println("vehicle speed: "+ this.vehicleSpeed);
        System.out.println("vehicle Weight: "+ this.vehicleWeight);
        System.out.println("vehicle color: "+ this.vehicleColor);
        //if the vehicleWeight is empty it prints the message as follows:
        if(this.vehicleWeight == ""){
            System.out.println("vehicleWeight value is not defined");
        }
        else{
            System.out.println("vehicle Weight: "+ this.vehicleWeight);
        } 
    }
}
    