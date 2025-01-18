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
class Lion extends Mammel{
    String lionName;
    void roar(){
        System.out.println(lionName + " is roaring");
    }
    Lion(String lionName, int age, String habitat, int noOfLegs){
        super(age, habitat, noOfLegs);
        this.lionName = lionName;
    }
}
class MultiLevelTypecasting {
    public static void main(String[] args) {
        Animal a = new Lion("chiku", 27, "arizona jungles", 4);
        Mammel m = (Mammel) a;
        System.out.println(m.noOfLegs);
        System.out.println(m.habitat);
        Lion l = (Lion) m;
        System.out.println(l.lionName);
        l.roar();
        Object o = new Lion("lkdd", 21, "ekj", 4);
        Lion l2 = (Lion) o;
        System.out.println(l2.age);
    }
    
}
