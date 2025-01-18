import java.util.*;

class VehicleReg {
    public static Scanner sc = new Scanner(System.in);
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private int fuelCapacity;

    VehicleReg(String regNo, String ownerName, String vehicleType, int fuelCapacity) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.fuelCapacity = fuelCapacity;
    }

    public String getRegNo() {
        if (regNo != null) {
            return regNo;
        }
        return null;

    }

    public int getFuelCapacity() {
        if (fuelCapacity > 0) {
            return fuelCapacity;
        }
        return 0;

    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    boolean authorization() {
        sc.nextLine();
        System.out.print("enter your name : ");
        String owner = sc.nextLine();
        if (owner.equalsIgnoreCase(ownerName)) {
            return true;
        }
        return false;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (authorization() == true) {
            this.fuelCapacity = fuelCapacity;
            System.out.println("fuel capacity is updated to " + fuelCapacity + " liters");
        } else {
            System.out.println("invalid name");
        }
    }

    void vehicleAcess() {
        System.out.println("what you want to access");
        System.out.println("  1. view vehicle details");
        System.out.println("  2. change fuel capacity");
        int y = sc.nextInt();
        if (y == 1) {
            System.out.println("This vehicle is a : " + getVehicleType());
            System.out.println("Regestration number is : " + getRegNo());
            System.out.println("Current owner : " + getOwnerName());
            System.out.println("Fuel capacity : " + getFuelCapacity());

        }
        if (y == 2) {
            System.out.print("what is the new Fuel Capacity: ");
            setFuelCapacity(sc.nextInt());
        }

    }
}

public class Vehicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleReg v1 = new VehicleReg("JH01AK8272", "Pranay Kumar", "Car", 50);
        VehicleReg v2 = new VehicleReg("WB09AU9079", "Rahul dua", "Truck", 400);
        VehicleReg v3 = new VehicleReg("WB76AP8979", "Harsh gujral", "SUV", 100);
        VehicleReg v4 = new VehicleReg("WB87HA83378", "Anubhav singh bassi", "Bike", 20);
        
        int x = 5;
        while (x != 0) {
            System.out.println("Choose a vehicle: \n1. Car   2. Truck   3. SUV   4. Bike");
            System.out.println("-----------------to exit press 0 -------------------");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    v1.vehicleAcess();
                    break;
                case 2:
                    v2.vehicleAcess();
                    break;
                case 3:
                    v3.vehicleAcess();
                    break;
                case 4:
                    v4.vehicleAcess();
                    break;
                default:
                    break;
            }

        }
    }
}
