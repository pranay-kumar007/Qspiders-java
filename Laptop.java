public class Laptop {
    String brand;
    String model;
    int memory;
    int ram;
    int refreshRate;

    Laptop(String brand, String model, int memory, int ram, int refreshRate){
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.ram = ram;
        this.refreshRate = refreshRate;
    }
    void display(){
        System.out.println("A " + brand +" "+ model+ "\n"+ "equiped with " + memory + " GB of memory space and " + "\n" + ram + " GB of RAM having a refresh rate of " + refreshRate + " Hz");
        System.out.println("-------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop("samsung", "notebook pro", 512, 16, 60);
        Laptop l2 = new Laptop("asus", "tuf f15", 512, 16, 144);
        Laptop l3 = new Laptop("apple", "macbook pro m3", 256, 16, 60);
        Laptop l4 = new Laptop("asus", "rog strix G9", 1034, 32, 240);
        Laptop l5 = new Laptop("acer", "predator helios 21x", 5060, 128, 360);
        l1.display();
        l2.display();
        l3.display();
        l4.display();
        l5.display();
    }
}
