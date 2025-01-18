import java.util.Scanner;
class Company{
    private String companyName;
    private String companyLocation;
    private double baseSalary;
    Company(){}
    Company(String companyName, String companyLocation, double baseSalary){
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.baseSalary = baseSalary;
    }
    public String getCompanyLocation() {
        return companyLocation;
    }
    public String getCompanyName() {
        return companyName;
    }
    double calculateSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

class Employe extends Company{
    String employeeName;
    int noOfHrsWorked;
    Employe(String employeeName, int noOfHrsWorked, String companyName, String companyLocation, double baseSalary){
        super(companyName, companyLocation, baseSalary);
        this.employeeName = employeeName;
        this.noOfHrsWorked = noOfHrsWorked;
    }
    @Override
    double calculateSalary(){
        double salary = (super.calculateSalary()/28)/8;
        return salary * noOfHrsWorked;
    }
    void displayDetails(){
        System.out.println("----------------------------------------");
        System.out.println("           Employe details..");
        System.out.println("----------------------------------------");
        System.out.println("Employee name: " + employeeName);
        System.out.println("Companay Name: " + getCompanyName());
        System.out.println("Company Location: " + getCompanyLocation());
        System.out.println("Base Salary: " + super.calculateSalary());
        System.out.println("Numbers of hours worked: " + noOfHrsWorked);
        System.err.println("Net Salary: " + calculateSalary());
    }
}
class Manager extends Company{
    String managerName;
    double bonus;
    Manager(String managerName, double bonus, String companyName, String companyLocation, double baseSalary){
        super(companyName, companyLocation, baseSalary);
        this.managerName = managerName;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
    void displayDetails(){
        System.out.println("----------------------------------------");
        System.out.println("           Manager details..");
        System.out.println("----------------------------------------");
        System.out.println("Manager name: " + managerName);
        System.out.println("Companay Name: " + getCompanyName());
        System.out.println("Company Location: " + getCompanyLocation());
        System.out.println("Base Salary: " + super.calculateSalary());
        System.out.println("Bonus Alloted: " + bonus);
        System.err.println("Net Salary: " + calculateSalary());
    }
}
public class CompanyMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag == true) {
            System.out.println("--------------------------------------------------");
            System.out.println("    This is a program to calculate net Salary");
            System.out.println("--------------------------------------------------");
            System.out.println("You are a..");
            System.out.println("1. Manager");
            System.out.println("2. Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice: ");
            int empChoice = sc.nextInt();
            sc.nextLine();
            if (empChoice == 1) {
                System.out.println("Enter your Details");
                System.out.print("Enter Manager name: ");
                String managerName = sc.nextLine();
                System.out.print("Enter Company name: ");
                String companyName = sc.nextLine();
                System.out.print("Enter Company Location: ");
                String companyLocation = sc.nextLine();
                System.out.print("Enter Base Salary: ");
                double baseSalary = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter Bonus Alloted : ");
                double bonus = sc.nextDouble();
                sc.nextLine();
                Manager m = new Manager(managerName, bonus, companyName, companyLocation, baseSalary);
                m.displayDetails();
            }
            else if (empChoice == 2) {
                System.out.println("Enter your Details");
                System.out.print("Enter Employee name: ");
                String employeeName = sc.nextLine();
                System.out.print("Enter Company name: ");
                String companyName = sc.nextLine();
                System.out.print("Enter Company Location: ");
                String companyLocation = sc.nextLine();
                System.out.print("Enter Base Salary: ");
                double baseSalary = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter Numbers of hours worked: ");
                int noOfHrsWorked = sc.nextInt();
                sc.nextLine();
                Employe m = new Employe(employeeName, noOfHrsWorked, companyName, companyLocation, baseSalary);
                m.displayDetails();
            }
            else if (empChoice == 0) {
                flag = false;
                System.out.println("Exiting.......................");
            }
        }
    }
}