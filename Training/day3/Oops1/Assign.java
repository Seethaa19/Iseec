import java.util.Objects;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assign {
    private String street;
    private String city;
    private Integer pincode;

    public Assign() {
    }

    public Assign(String street, String city, Integer pincode) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Address other = (Address) obj;
        return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
                && Objects.equals(street, other.street);
    }

    @Override
    public String toString() {
        return street + "," + city + "-" + pincode;
    }

}

public class Customer {
    private String name;
    private Address address;

    public Customer() {
    }

    public Customer(String name, Address address) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Customer other = (Customer) obj;
        return Objects.equals(name, other.name) && this.address.equals(other.getAddress());
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAddress:" + address.getStreet() + "," + address.getCity() + "-"
                + address.getPincode();
    }

}
public class Main {

    public static void main(String[] args) {
        Customer[] customers = null, duplicateCustomers = null;
        Customer customer = null;
        Address address = null;
        int customersCount = 0, i = 0, duplicateCustomersCount = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            customers = new Customer[100];
            duplicateCustomers = new Customer[100];

            System.out.println("Enter the number of customers");
            customersCount = scanner.nextInt();

            do {
                customer = new Customer();
                address = new Address();

                System.out.printf("Enter the Customer Details %d \n", i + 1);
                System.out.println("Enter the name");
                customer.setName(scanner.next());

                System.out.println("Enter the street");
                address.setStreet(scanner.next());

                System.out.println("Enter the city");
                address.setCity(scanner.next());

                System.out.println("Enter the pincode");
                address.setPincode(scanner.nextInt());

                customer.setAddress(address);
                customers[i] = customer;
            } while (++i < customersCount);

            for (i = 0; i < customersCount; i++) {
                for (int j = i + 1; j < customersCount; j++) {
                    if (customers[i].equals(customers[j])) {
                        duplicateCustomers[duplicateCustomersCount++] = customers[i];
                    }
                }
            }

            if (duplicateCustomers[0] == null) {
                System.out.println("No duplicate details");
            } else {
                System.out.println("The identical Customers Details:");

                for (i = 0; i < duplicateCustomersCount; i++) {
                    System.out.println((i + 1) + ")" + duplicateCustomers[i]);
                }
            }

        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Error: Invalid input");
        } catch (Exception exception) {
            System.err.println("Error: An error occurred");
        }

    }

}
