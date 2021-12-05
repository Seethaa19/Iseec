import java.util.InputMismatchException;
import java.util.Scanner;
public class Oops1 {
    private String street;
    private String city;
    private Integer pincode;

    public Oops1() {
    }

    public Oops1(String street, String city, Integer pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return street + "," + city + "-" + pincode;
    }

}

class Oops_Task {
    private String name;
    private Address address;

    public Oops_Task() {
    }

    public Oops_Task(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + address.toString();
    }

}

public class Main {

    public static void main(String[] args) {
        Customer customer = null;
        Address address = null;

        try (Scanner scanner = new Scanner(System.in)) {
            customer = new Customer();
            address = new Address();

            System.out.println("Enter the name");
            customer.setName(scanner.next());

            System.out.println("Enter the street");
            address.setStreet(scanner.next());

            System.out.println("Enter the city");
            address.setCity(scanner.next());

            System.out.println("Enter the pincode");
            address.setPincode(scanner.nextInt());

            customer.setAddress(address);

            System.out.println(customer);

        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Error: Invalid input");
        } catch (Exception exception) {
            System.err.println("Error: An error occurred");
        }

    }

}


