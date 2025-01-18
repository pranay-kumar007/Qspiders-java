class Sample {
    String s;
    int x;

    Sample(String s, int x){
        this.s = s;
        this.x = x;
    }
}
class Demo extends Sample{
    String y;
    int z;
    Demo(String s, int x, String y, int z){
        super(s,x);
        this.y = y;
        this.z = z;
    }

}
public class Main{
    public static void main(String[] args) {
        Sample s = new Demo("pranay", 287, "kumar", 4398);
        System.out.println(s.s);
        System.out.println(s.x);
        // System.out.println(s.y); CTE
        // System.err.println(s.z); CTE
        Demo d = (Demo) s;
        System.err.println(d.s + " " + d.y);
        System.out.println(d.x + "  :  " + d.z);
    }
}