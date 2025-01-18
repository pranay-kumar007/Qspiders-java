class Teacher{
    String name;
    String subject;

    Teacher(){}
    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    void teach(){
        System.out.println(name + " Sir is teaching");
    }
}
class MathTeacher extends Teacher{
    String specialization;
    MathTeacher(String name, String subject, String specialization){
        super(name, subject);
        this.specialization = specialization;
    }
    void conductExam(){
        System.out.println(name + " Sir is conducting exam");
    }
}

public class TeacherMain {
    public static void main(String[] args) {
        MathTeacher mt1 = new MathTeacher("akshay slathia", "Mathematics", "Calculas");
        System.out.println("Name: "+mt1.name);
        System.out.println("Subject: "+mt1.subject);
        System.out.println("Specialization: "+mt1.specialization);
        mt1.teach();
        mt1.conductExam();

    }
}
