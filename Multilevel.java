class A{
    private int tyb;
    String name;
    A(){}
    A(int tyb, String name){
        this.tyb = tyb;
        this.name = name;

    }
}

class C extends A{
    int id;
    C(){

    }
    C(int tyb, String name, int id){
        super(tyb, name);
        this.id = id;
    }
}
public class Multilevel {
    public static void main(String[] args) {
        // A a = new A();
        // System.out.println(a.name);
        // //System.out.println(a.phoneNo);
        // //System.out.println(a.id);
        // System.out.println("-----------------------");
        // B b = new B();
        // System.out.println(b.name);
        // System.out.println(b.phoneNo);
        // //System.out.println(b.id);
        // System.out.println("-----------------------");
        // C c = new C();
        // System.out.println(c.name);
        // System.out.println(c.phoneNo);
        // System.out.println(c.id);

        A a = new C(45, "hsdj", 54);
        C c = (C) a;
        System.out.println(c.id);
        
    }
    
    
}
