import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
public String customerName;
public String customerEmail;
public String customerType;
public String customerAddress;

    public Customer(){
}
public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
this.customerName = customerName;
this.customerEmail = customerEmail;
this.customerType = customerType;
this.customerAddress = customerAddress;
}

public void displayDetails() {
System.out.println("Name: " + customerName);
System.out.println("E-mail: " + customerEmail);
System.out.println("Type: " + customerType);
System.out.println("Location: " + customerAddress);
}

    public void setAddress(Address address) {
    }

    public void setName(String next) {
    }
}

class Main1 {

    public static void main(String[] args) {
        Customer customer = null;
        String customerName, customerEmail, customerType, customerAddress;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Customer Details");

            System.out.println("Enter the name");
            customerName = scanner.next();

            System.out.println("Enter the email");
            customerEmail = scanner.next();
            System.out.println("Enter the type");
            customerType = scanner.next();

            System.out.println("Enter the location");
            customerAddress = scanner.next();
            customer = new Customer(customerName, customerEmail, customerType, customerAddress);
            customer.displayDetails();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Error: Invalid input");
        } catch (Exception exception) {
            System.err.println("Error: An error occurred");
        }
    }
}
