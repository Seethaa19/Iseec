import java.util.Scanner;

public class Expenses {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Total Branding Expense:");
        int Branding = Sc.nextInt();
        System.out.println("Enter Total Travel Expense:");
        int Travel = Sc.nextInt();
        System.out.println("Enter Total Food Expense:");
        int Food = Sc.nextInt();
        System.out.println("Enter Total Logistics Expense:");
        int Logistic = Sc.nextInt();
        int total = Branding + Travel + Food + Logistic;
        System.out.println("Enter Total Expense is:" + total);
        System.out.printf("Branding Expense in percentage:%.2f\n", ((double) Branding / (double) (total)) * 100);
        System.out.printf("Travel Expense in percentage:%.2f\n", ((double) (Travel) / (double) (total)) * 100);
        System.out.printf("Food Expense in percentage:%.2f\n", ((double) (Food) / (double) (total)) * 100);
        System.out.printf("Branding Expense in percentage:%.2f\n", ((double) (Logistic) / (double) (total)) * 100);
    }
}
