public class constructor {
   int age;
   String name;
   constructor(int age){
    this.age = age;
   }
   void display(){
    System.out.println(name);
    System.out.println(age);
   }
   public static void main(String[] args) {
    constructor c = new constructor(24);
    c.name = "jbfjk";
    c.display();
   }

}
