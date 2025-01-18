public class Mobile {

    String brand;
    int ram;
    int memory;
    double size;
    double versionOfAndroid;

    public void camera() {
        System.out.println("clicked a photo");

    }

    public void song() {
        System.out.println("song playing ");
    }

    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        samsung.brand = "samsung";
        System.out.println(samsung.brand);
        System.out.println(samsung.ram);
        System.out.println(samsung.memory);
        System.out.println(samsung.size);
        System.out.println(samsung.versionOfAndroid);

        samsung.camera();
        samsung.song();

    }

}
