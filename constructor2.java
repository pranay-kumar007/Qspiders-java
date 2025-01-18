class constructor2{
    public static void main(String[] args) {
        program1 p1 = new program1(20, "program1");
        p1.display();
        program2 p2 = new program2(30, "program2");
        p2.display();
        program3 p3 = new program3();
        p3.display();
        program4 p4 = new program4(70, "program4");
        p4.display();
        System.out.println(p4);
        program4 p5 = new program4(80, "program4");
        p5.display();
        System.out.println(p5);
        program4 p6 = new program4(90, "program4");
        p6.display();
        System.out.println(p6);

    }
}

class program1 {
    int a;
    String str;
    program1(int x, String st){
        a = x;
        str = st;
    }
    void display(){
        System.out.println(a + "   " + str);
    }
    
}
class program2{
    int a;
    String str;
    program2(int a, String str){
        this.a = a;
        this.str = str;
    }
    void display(){
        System.out.println(a + "   " + str);
    }
}
class program3 {
    int a;
    int x;
    String str;
    program3()
    {

    }
    void display(){
        System.out.println(a + "   " + str + "   " + x);
    }
}
class program4{
    int a;
    String str;
    program4(int a, String str){
        this.a = a;
        this.str = str;
    }
    void display(){
        System.out.println(a + "   " + str);
        System.out.println(this);
    }
}