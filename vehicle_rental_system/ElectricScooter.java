/**
 * Write a description of class Vehicle here.
 * 
 * @author (Rose Duwal,NP01CP4S220096)
 * @version(1.0.0)
 */
//Creating class name ElectricScooter
public class ElectricScooter extends Vehicle
{
    //Declaring the instance variable for the class
    //attributes of class ElectricScooter
     private int range;
     private int batteryCapacity;
     private int price;
     private String chargingTime;
     private String brand;
     private String mileage;
     private boolean hasPurchased;
     private boolean hasSold;
    
    //Defining the parameterized Constructor
    public ElectricScooter(int vehicleID, String vehicleName,String vehicleWeight, String vehicleSpeed, String vehicleColor,
    int batteryCapacity){
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
        super.setVehicleSpeed(vehicleSpeed);//calling mutator method from super class
        super.setVehicleColor(vehicleColor);
        this.batteryCapacity=batteryCapacity;
        this.range=0;
        this.price=0;
        this.brand="";
        this.mileage="";
        this.chargingTime="";
        this.hasPurchased=false;
        this.hasSold=false;
    }
    
    //accessor method
    //getter method for Range
    public int getRange(){
            return this.range;
    }
        
    //getter method for BatteryCapacity
    public int getBatteryCapacity(){
            return this.batteryCapacity;
    }
    
    //getter method for Price
    public int getPrice(){
            return this.price;
    }
    
    //getter method for ChargingTime
    public String getChargingTime(){
            return this.chargingTime;
    }
    
    //getter method for Brand
    public String getBrand(){
            return this.brand;
    }
    
    //getter method for Mileage
    public String getMileage(){
            return this.mileage;
    }
    
    //getter method for HasPurchased
    public boolean getHasPurchased(){
            return this.hasPurchased;
    }
    
    //getter method for HasSold
    public boolean getHasSold(){
            return this.hasSold;
    }
    
    //It is a setter method for Brand that sets Brand as newBrand
    public void setBrand (String newBrand){
        if(this.hasPurchased ==false){
            this.brand=newBrand;
        }else{
            System.out.println("It is not possible to change brand of the electric scooter .");
        }
    }
    
    //This method is used to purchase
    public void purchase(String brand, int price,String chargingTime,String mileague,int range){
        if(!this.hasPurchased){
            setBrand(brand);
            this.price=price;
            this.chargingTime=chargingTime;
            this.mileage=mileague;
            this.range=range;
            this.hasPurchased=true;
        }
        else{
            System.out.println("The electric scooter has been purchased");
        }
    }
    
    //This method is used to sell
    public void sell(int price){
        this.price=price;
         
        if(!this.hasSold){
              this.range=0;
              this.chargingTime="";
              this.mileage= "";
              this.batteryCapacity=0;
              this.hasSold= true;
              this.hasPurchased= false;
        }else{
              System.out.println("The scooter is already sold");
        }
      
      }
    
    /*If the ElectricScooter is purchased, this function displays the output of each attribute of the ElectricScooter class and 
    the Vehicle class, along with appropriate comments. Otherwise, it only calls the display() method of super class.  */
    public void display(){
        super.display();
        if(this.hasPurchased){
            System.out.println("Brand:" +this.brand);
            System.out.println("Battery Capacity: " +this.batteryCapacity);
            System.out.println("Mileage: "+this.mileage);
            System.out.println("Range: "+this.range);
            System.out.println("Recharge Time: "+this.chargingTime);
        }
    }
}
    
    