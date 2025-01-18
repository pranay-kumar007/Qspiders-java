class Employe{
    String name;
    int id;
    double salary;
    Employe(){}
    Employe(String name, int id, double salary){
        this.name = name;
        this.id  = id;
        this. salary = salary;
    }
    void work(){
            System.out.println(name + " is working");
    }
}
class Manager extends Employe{
    int teamSize;
    Manager(){}
    Manager(String name, int id, double salary,int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void assignTask(){
        System.out.println(name + " Sir is assigning a task for a web developement project");
    }
}

public class EmployeMain {
    public static void main(String[] args) {
        Manager m1 = new Manager("Pranay Kumar", 167, 76778600d, 70);
        System.out.println("Employe name is: "+ m1.name);
        System.out.println("Employe id is: "+ m1.id);
        System.out.println("Employe salary is: "+ m1.salary);
        m1.work();
        m1.assignTask();
    }
}
