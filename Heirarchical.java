class Fruit{
    String origin;
    int quantity;
    Fruit(){}
    Fruit(String origin, int quantity){
        this.origin = origin;
        this.quantity = quantity;
    }
}
class Apple extends Fruit{
    String taste;
    double price;
    Apple(String origin, int quantity, String taste, double price){
        super(origin, quantity);
        this.taste = taste;
        this.price = price;
    }
    void dispApple(){
        System.out.println("Fruit Name: Apple");
        System.out.println("Origin: "+origin);
        System.out.println("No of boxes: "+quantity);
        System.err.println("Taste type: "+taste);
        System.out.println("Price: "+price);
        System.out.println("-------------------");
    }   
}
class Orrange extends Fruit{
    String taste;
    double price;
    Orrange(String origin, int quantity, String taste, double price){
        super(origin, quantity);
        this.taste = taste;
        this.price = price;
    }
    void dispOrrange(){
        System.out.println("Fruit Name: Orrange");
        System.out.println("Origin: "+origin);
        System.out.println("No of boxes: "+quantity);
        System.err.println("Taste type: "+taste);
        System.out.println("Price: "+price);
        System.out.println("-------------------");
    }   
}
public class Heirarchical {
    public static void main(String[] args) {
        Apple a1 = new Apple("Kashmir", 12, "Sweet", 5000);
        a1.dispApple();
        Orrange o1 = new Orrange("Himachal", 15, "Sweet and sour", 650);
        o1.dispOrrange();
    }
}
