import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

class Administrator{
    private String username;
    private String password;
    private String name;
    private long contact;
    private String address;
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    boolean authorization(String username, String password){
        if (this.username == username && this.password == password) {
            return true;
        }
        return false;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    public void setName(String name) {
        this.name = name;
    }

    Administrator(String username, String password, String name, long contact, String address){
        
        this.username = username;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    void adminDetails(String username, String Password){
        if (this.username.equals(username) && this.password.equals(Password)) {
            System.out.println("Hello Mr. " + name );
            System.out.println("Your name is: "+name);
            System.out.println("Your contact is: "+contact);
            System.out.println("your address is: "+address);
        }
            
    }
}
class Product{
    String id;
    String productType;
    double productPrice;
    String brand;
    long idCount = 0;
    Product(){}
    Product(String productType, double productPrice, String brand){
        this.id = (productType + "#"+ idCount);
        idCount++;
        this.productType = productType;
        this.productPrice = productPrice;
        this.brand = brand;
    }

    void search(String productType){
        if (this.productType.equals(productType)) {
            System.out.println("id: "+this.id);
            System.out.println("productType: "+this.productType);
            System.out.println("productPrice: " + this.productPrice);
            System.out.println("brand: " + this.brand);
        }
    }
    void search(double productPrice){
        if (this.productPrice == productPrice) {
            System.out.println("id: "+this.id);
            System.out.println("productType: "+this.productType);
            System.out.println("productPrice: " + this.productPrice);
            System.out.println("brand: " + this.brand);
        }
    }
    void search(String brand, String productType){
        if (this.brand.equals(brand) && this.productType.equals(productType)) {
            System.out.println("id: "+this.id);
            System.out.println("productType: "+this.productType);
            System.out.println("productPrice: " + this.productPrice);
            System.out.println("brand: " + this.brand);
        }
    }
    void search(String productType, double productPrice){
        if (this.productType.equals(productType) && this.productPrice == productPrice) {
            System.out.println("id: "+this.id);
            System.out.println("productType: "+this.productType);
            System.out.println("productPrice: " + this.productPrice);
            System.out.println("brand: " + this.brand);
        }
    }
    void search(String productType, double productPrice, String brand){
        if (this.productType.equals(productType) && this.productPrice == productPrice && this.brand.equals(brand)) {
            System.out.println("id: "+this.id);
            System.out.println("productType: "+this.productType);
            System.out.println("productPrice: " + this.productPrice);
            System.out.println("brand: " + this.brand);
        }
    } 
}
class Laptops extends Product{

}
class Smartphones extends Product{

}
class Television extends Product{

}
class Camera extends Product{

}

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Administrator[] admins = new Administrator[10];
        admins[0] = new Administrator("pranay", "Pranay@007", "Pranay kumar", 6201766211l, "Salt lake AQ block");
        int adminCount = 1;
        Product[] products = new Product[50];
        products[0] = new Product("SmartPhone", 80000, "Apple");
        products[1] = new Product("SmartPhone", 120000, "Samsung");
        products[2] = new Product("Laptop", 90000, "Asus");
        int productCount = 3;
        
        boolean flag = true;
        while (flag == true) {
            System.out.println("------------------------------------------");
            System.out.println("    Welcome to Java Shoping Center");
            System.out.println("------------------------------------------");
            System.out.println("1. Register as Administrator");
            System.out.println("2. I am Administrator");
            System.out.println("3. Search for available products");
            System.out.println("0. Exit application");
            System.out.print("Choose one option : ");
            byte choice = sc.nextByte();
            sc.nextLine();
        switch (choice) {
            case 1:
                {
                    System.out.println();
                    System.out.print("Enter a Username: ");
                    String User = sc.next();
                    System.out.println("Enter a Password: ");
                    String pass = sc.next();
                    sc.nextLine();
                    System.out.print("Enter your full name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your contact no: ");
                    Long contact = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter your address: ");
                    String address = sc.nextLine();
                    admins[adminCount] = new Administrator(User, pass, name, contact, address);
                    System.out.println("Administrator registered successfully....");
                    adminCount++;
                    break;
                }
            case 2:
                {   
                    System.out.println("Login with your credentials...");
                    System.out.print("Enter you Username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter your Password: ");
                    String password = sc.nextLine();
                    Administrator currentAdministrator = null;
                    boolean verification = false;
                    for(int i = 0;i<adminCount;i++){
                        if (admins[i].getUsername().equals(username)&& admins[i].getPassword().equals(password)) {
                            verification = true;
                            currentAdministrator = admins[i];
                            
                        }
                    }
                    currentAdministrator.adminDetails(username, password);

                    if (verification == true) {
                        System.out.println("--------------------------");
                        System.err.println("1. Change Username");
                        System.out.println("2. Change Password");
                        System.out.println("3. Change name");
                        System.out.println("4. Change contact");
                        System.out.println("5. Change address");
                        System.out.println("6. Add new Product");
                        System.out.println("0. Logout");
                        boolean adminFlag = true;
                        while (adminFlag == true) {
                            byte adminChoice = sc.nextByte();
                            sc.nextLine();
                            switch (adminChoice) {
                                case 1:
                                    System.out.println("New Username");
                                    String newUsername = sc.nextLine();
                                    currentAdministrator.setUsername(newUsername);
                                    break;
                                case 2:
                                    System.out.println("New Password");
                                    String newPassword = sc.nextLine();
                                    currentAdministrator.setPassword(newPassword);
                                    break;
                                case 3:
                                    System.out.println("New Name");
                                    String newName = sc.nextLine();
                                    currentAdministrator.setName(newName);
                                    break;
                                case 4:
                                    System.out.println("New Contact");
                                    long newContact = sc.nextLong();
                                    currentAdministrator.setContact(newContact);
                                    break;
                                case 5:
                                    System.out.println("New Address");
                                    String newAddress = sc.nextLine();
                                    currentAdministrator.setAddress(newAddress);
                                    break;
                                case 6:

                                case 0:
                                    adminFlag = false;
                                    System.out.println("Logged out successfully....");
                                default:
                                    break;
                            }
                        }

                    }
                    break;
                }
            case 3:
                {   
                    boolean searchFlag = true;
                    while (searchFlag) {
                        
                        System.out.println("1. Search by ProductType");
                        System.out.println("2. Search by Product Price range");
                        System.out.println("3. Search by product Brand");
                        System.out.println("4. Search by ProductType and Brand");
                        System.out.println("5. Search by ProductType, Price, and Brand");
                        System.out.println("0. Exit searching...");
                        int searchChoice = sc.nextInt();
                        sc.nextLine();
                        if (searchChoice == 1) {
                            System.out.println("Enter Product Type");
                            String productTypeToSearch = sc.nextLine();
                            for (Product product : products) {
                                if (product.productType.equals(productTypeToSearch)) {
                                    product.search(productTypeToSearch);
                                }
                            }
                        }
                        else if (searchChoice == 0) {
                            System.out.println("Exiting Searching....");
                            flag = false;
                        } 
                    }
                    
                }    
            case 0:
                {   
                    flag = false;
                    System.out.println("Exiting......");
                }
            default:
                break;
        }
    }   
    }
}
