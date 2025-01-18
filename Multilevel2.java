class Product{
    String name;
    double price;
    Product(){}
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}
class Electronic extends Product{
    String brand;
    double warrantyPeriod;
    Electronic(){}
    Electronic(String name, double price, String brand, double warrantyPeriod){
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
}
class Smartphone extends Electronic{
    double memory;
    int ram;
    double batteryCapacity;
    Smartphone(String name, double price, String brand, double warrantyPeriod, double memory, int ram, double batteryCapacity){
        super(name, price, brand, warrantyPeriod);
        this.memory = memory;
        this.ram = ram;
        this.batteryCapacity = batteryCapacity;
    }

    void dispSmartphone(){
        System.out.println("This is a " + name + " from " + brand + "\nand is having a nominal price of." + price + "\nAnd it comes with " + memory + " GB of memory,\n" + ram + " GB of ram and " + batteryCapacity + " MAh of battery capacity \nAnd along with that it is having a warranty period of " + warrantyPeriod + " years out of the box" );
    }
}
public class Multilevel2 {
    public static void main(String[] args) {
        Smartphone s24 = new Smartphone("Smartphone", 70000, "Samsung", 1, 256, 8, 4000);
        s24.dispSmartphone();
        Smartphone rog = new Smartphone("Smartphone", 9000000, "ASUS Rog 100", 5, 1024000d, 512, 70000);
        rog.dispSmartphone();

    }
}
