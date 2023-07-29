/**
 * Write a description of class Vehicle here.
 * 
 * @author (Rose Duwal,NP01CP4S220096)
 * @version(1.0.0)
 */
//Creating a class named AutoRickshaw
public class AutoRickshaw extends Vehicle
{
      //attributes of class AutoRickshaw
      //Declaring the instance variable for the class

     private int engineDisplacement;
     private String torque;
     private int numberofSeats;
     private int fuelTankCapacity;
     private String groundClearance;
     private int chargeAmount;
     private String bookedDate;
     private boolean isBooked;
    //Defining the parameterized constructor
    public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed,
    int engineDisplacement,String torque, int fuelTankCapacity, String groundClearance){
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
        this.engineDisplacement= engineDisplacement;
        this.torque= torque;
        this.fuelTankCapacity= fuelTankCapacity;
        this.groundClearance= groundClearance;
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        this.isBooked= false;
    }
    
    //getter method for EngineDisplacement
    public int getEngineDisplacement(){
        return this.engineDisplacement;
    }
    
    //getter method for Torque
    public String getTorque(){
        return this.torque;
    }
    
    //getter method for NumberOfSeats
    public int getNumberOfSeats(){
        return this.numberofSeats;
    }
    
    //getter method for FuelTankCapacity
    public int getFuelTankCapacity(){
        return this.fuelTankCapacity;
    }
    
    //getter method for GroundClearance
    public String getGroundClearance(){
        return this.groundClearance;
    }
    
    //getter method for ChargeAmount
    public int getChargeAmount(){
        return this.chargeAmount;
    }
    
    //getter method for BookedDate
    public String getBookedDate(){
        return this.bookedDate;
    }
    
    //getter method for IsBooked
    public boolean getIsBooked(){
        return this.isBooked;
    }
    
    //Setter method for ChargeAmount that sets amount as new chargeAmount
    public void setChargeAmount(int newChargeAmount){
        this.chargeAmount=newChargeAmount;
    }
    
    //Setter method for NumberOfSeats that sets Seats as new NumberOfSeats
    public void setNumberOfSeats(int newNumberOfSeats){
        this.numberofSeats= newNumberOfSeats;
    }
    
    //THis is a method that allows to booked a AutoRickhshaw 
    public void Book(String bookedDate, int chargeAmount, int numberOfSeats){
        if(this.isBooked == false){
            this.bookedDate = bookedDate;
            this.isBooked=true;
            this.chargeAmount= chargeAmount;
            this.numberofSeats= numberOfSeats;
            System.out.println("your autorickshaw is booked");
        }else{
            System.out.println("isBooked= " +this.isBooked);
            System.out.println("this autorickshaw is already booked");
        }
    }
    
    /*If the AutoRickshaw is booked, this function shows the result of each Autorickshaw class and Vehicle class attribute with
    appropriate comments. It informs the user whether or not the fee Amount and numberOfSeats are set. Otherwise, it only calls 
    the display() method of super class. */
    public void display(){
        super.display();
        if(isBooked==true){
            System.out.println("EngineDisplacement=" +this.engineDisplacement);
            System.out.println("Torque=" +this.torque);
            System.out.println("FuelTankCapacity=" +this.fuelTankCapacity);
            System.out.println("GroundClearance=" +this.groundClearance);
            System.out.println("BookedDate=" +this.bookedDate);
        }
        
        //If the chargeAmount is empty it displays the message shown below.
        if(this.chargeAmount==0){
            System.out.println("Charge amount not set");
        }else{
        System.out.println("ChargeAmount="+ this.chargeAmount);
        }
        
        if(this.numberofSeats == 0){
        System.out.println("number of seats not set");
        }else{
        System.out.println("numberofseats=" +this.numberofSeats);
        }
    
    }
}
