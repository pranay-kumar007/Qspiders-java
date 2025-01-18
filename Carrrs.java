class Engine{
    String engineModel;
    double power;
    Engine(String engineModel, double power){
        this.engineModel = engineModel;
        this.power = power;
    }
}
class Car extends Engine{
    String manufacturer;
    int maxSpeed;
    Car(String model, double power, String manufacturer, String engineModel, int maxSpeed){
        super(engineModel, power);
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
    }

}
class Car1 extends Car{
    String owner;
    String model;
    Car1(String owner, String model, double power, String manufacturer, String engineModel, int maxSpeed){
        super(model, power, manufacturer, engineModel, maxSpeed);
        this.owner = owner;
        this.model = model;
    }
    void disp(){
        System.out.println("this is all new veryon..........");
        System.out.println("Manufacturer: "+ manufacturer);
        System.out.println("Current owner: "+ owner);
        System.out.println("Model: "+model);
        System.out.println("Engine Model: "+ engineModel);
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("power: "+power);
    }
}
class Car2 extends Car{
    String owner;
    String model;
    Car2(String owner, String model, double power, String manufacturer, String engineModel, int maxSpeed){
        super(model, power, manufacturer, engineModel, maxSpeed);
        this.owner = owner;
        this.model = model;

    }
    void disp(){
        System.out.println("this is all new chiron......");
        System.out.println("Manufacturer: "+ manufacturer);
        System.out.println("Current owner: "+ owner);
        System.out.println("Model: "+model);
        System.out.println("Engine Model: "+ engineModel);
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("power: "+power);
    }
}
class Car3 extends Car{
    String owner;
    String model;
    Car3(String owner, String model, double power, String manufacturer, String engineModel, int maxSpeed){
        super(model, power, manufacturer, engineModel, maxSpeed);
        this.owner = owner;
        this.model = model;

    }
    void disp(){
        System.out.println("this is all new boat tail.......");
        System.out.println("Manufacturer: "+ manufacturer);
        System.out.println("Current owner: "+ owner);
        System.out.println("Model: "+model);
        System.out.println("Engine Model: "+ engineModel);
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("power: "+power);
    }
}
public class Carrrs {

    static void checkcar(Car c){
        if (c instanceof Car1) {
            Car1 car1 = (Car1)c;
            car1.disp();
        }
        else if (c instanceof Car2) {
            Car2 car2 = (Car2)c;
            car2.disp();
        }
        else{
            Car3 car3 = (Car3)c;
            car3.disp();
        }
    }
    public static void main(String [] args){
        Car[] cars = new Car[3];
        cars[0] = new Car1("Pranay", "veryon", 16000, "Bugati", "v12", 400);
        cars[1] = new Car2("Pranay", "chiron", 27898, "Bugati", "v16", 413);
        cars[2] = new Car3("Pranay", "boat tail", 12900, "Rolls-Royce", "v12", 312);
        for (int i = 0; i<3;i++) {
            checkcar(cars[i]);
            System.out.println("---------------------------------------------------");
        }

    }
}
