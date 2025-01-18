class Animal{
    int age;
    String habitat;

    Animal(int age, String habitat){
        this.age = age;
        this.habitat = habitat;
    }

}
class Mammel extends Animal{
    int noOfLegs;
    Mammel(int age, String habitat, int noOfLegs){
        super(age, habitat);
        this.noOfLegs = noOfLegs;
    }
}
class Lion extends Animal{
    String lionName;
    void roar(){
        System.out.println(lionName + " is roaring");
    }
    Lion(String lionName, int age, String habitat){
        super(age, habitat);
        this.lionName = lionName;
    }
}
class Heirarchal {
    public static void main(String[] args) {
        Animal a = new Lion("chiku", 27, "arizona jungles");
        Lion l = (Lion) a;
        System.out.println(l.age);
        System.out.println(l.habitat);
        System.out.println(l.lionName);
        System.out.println("-----------------------------------------------");
        Animal a2 = new Mammel(24, "water", 2);
        Mammel m = (Mammel) a2;
        System.out.println(m.age);
        System.out.println(m.habitat);
        System.out.println(m.noOfLegs);
    }
    
}
