import java.util.Scanner;
public class Salary {
    public static void main(String [] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the total salary paid: ");
        int salary = Sc.nextInt();
        int weekend=(salary-800)/130;
        int weekdays=10+weekend;
        System.out.println("Number of weekdays hours: "+weekdays);
        System.out.println("Number of weekend hours: "+weekend);
    }
}
