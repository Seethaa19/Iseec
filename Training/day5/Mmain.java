import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Exhibition obj1=new Exhibition();
        StageEvent obj2=new StageEvent();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the event: ");
        String name=sc.nextLine();
        System.out.println("Enter the detail of the event: ");
        String detail=sc.nextLine();
        System.out.println("Enter the owner name of the event: ");
        String owner=sc.nextLine();
        System.out.println("Enter the type of the event: ");
        System.out.println("1.Exhibition");
        System.out.println("2.StageEvent");
        int input=sc.nextInt();

        switch(input){
            case 1:
                System.out.println("Enter the number of stalls:");
                Integer n=sc.nextInt();
                obj1.setNoOfStalls(n);
                System.out.println("The projected revenue of the event is "+obj1. projectedRevenue());

            case 2:
                System.out.println("Enter the number of shows: ");
                Integer nevent=sc.nextInt();
                System.out.println("Enter the number of seats per show: ");
                Integer sevent=sc.nextInt();
                obj2.setNoOfShows(nevent);
                obj2.setNoOfSeatsPerShow(sevent);
                System.out.println("The projected revenue of the event is "+obj2. projectedRevenue());
        }
    }

}

