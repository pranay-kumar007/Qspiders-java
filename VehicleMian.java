class Vehicle{
    String brand;
    int speed;
    Vehicle(){}
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void start(){
        System.out.println("Your vehicle is start now set your destination and start riding");
    }
    void stop(){
        System.out.println("vehicle stopped");
    }
}
class Bike extends Vehicle{
    String type;
    Bike(){}
    Bike(String brand, int speed, String type){
        super(brand, speed);
        this.type = type;
    }
    void doWheelie(){
        System.out.println("wheelie");
    }
}

public class VehicleMian {
    public static void main(String[] args) {
        Bike b1 = new Bike("Royal Enfield", 160, "Bobber");
        System.out.println("Brand of bike is: "+b1.brand);
        System.out.println("Speed is: "+b1.speed);
        System.out.println("type of bike is: "+b1.type);
        b1.start();
        b1.doWheelie();
        b1.stop();
        System.out.println("------------------------------");
        Bike b2 = new Bike("Harley Davidson", 240, "Vintage");
        System.out.println("Brand of bike is: "+b2.brand);
        System.out.println("Speed is: "+b2.speed);
        System.out.println("type of bike is: "+b2.type);
        b2.start();
        b2.doWheelie();
        b2.stop();
    }
}
