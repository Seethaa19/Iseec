import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people who watched show 1");
        int show1 = sc.nextInt();
        System.out.println("Enter the average rating for show 1");
        float rating1 = sc.nextFloat();
        System.out.println("Enter the number of people who watched show 2");
        int show2 = sc.nextInt();
        System.out.println("Enter the average rating for show 2");
        float rating2 = sc.nextFloat();
        System.out.println("Enter the number of people who watched show 3");
        int show3 = sc.nextInt();
        System.out.println("Enter the average rating for show 3");
        float rating3 = sc.nextFloat();
        float ratings=(float) ((show1*rating1)+(show2*rating2)+(show3*rating3))/(show1+show2+show3);
        System.out.println("Overall Rating:"+ratings);


    }

}