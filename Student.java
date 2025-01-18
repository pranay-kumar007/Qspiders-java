public class Student {
    String name;
    int rollNo;
    int Class;
    long contact;

    Student(String name, int rollNo, int Class, long contact) {
        this.name = name;
        this.rollNo = rollNo;
        this.Class = Class;
        this.contact = contact;
    }

    void work() {
        System.out.println("studying");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Pranay kumar", 41, 12, 6201766211L);
        Student s2 = new Student("ufhioh", 12, 11, 3874884898L);
        Student s3 = new Student("oiwejri", 31, 11, 3284808834L);
        System.out.println(s1.contact);
        System.out.println(s2.name);
        System.out.println(s3.Class);
    }
}
