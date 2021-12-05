import java.util.Scanner;

public class Items {
    private static  String name;
    private static  double CostPerDay;
    private static  double Deposit;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCostPerDay() {
        return CostPerDay;
    }
    public void setCostPerDay(double costPerDay) {
        CostPerDay = costPerDay;
    }
    public double getDeposit() {
        return Deposit;
    }
    public void setDeposit(double deposit) {
        Deposit = deposit;
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Cost Per Day "+CostPerDay);
        System.out.println("Deposit : "+Deposit);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Item Type:");
        name=sc.next();
        System.out.println("Enter the Cost per Day: ");
        CostPerDay =sc.nextDouble();
        System.out.println("Enter the Deposit:");
        Deposit=sc.nextDouble();
        Items s= new Items();
        s.display();
    }

}