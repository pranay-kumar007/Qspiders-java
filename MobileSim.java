class Sim{
    String provider;
    String band;
    Sim(String provider, String band){
        this.provider = provider;
        this.band = band;
    }
}
class Mobile1{
    Sim s1;
    Sim s2;
    private void addSim1(Sim s1){
        this.s1 = s1;
    }
    private void addSim2(Sim s2){
        this.s2 = s2;
    }
    public void addSim(Sim s){
        
    }

    
}


public class MobileSim {
    public static void main(String[] args) {
        Mobile1 m1 = new Mobile1();
    }
}
