import java.util.Scanner;

public class RunRate {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Overs:");
        int totalovers = sc.nextInt();
        System.out.print("Enter Total Runs:");
        int totalruns = sc.nextInt();
        System.out.print("Enter No Of Overs Bowled:");
        int noofoverbowled = sc.nextInt();;
        System.out.print("Enter No Runs Scored So Far:");
        int runsofar = sc.nextInt();
        float truns=runsofar/noofoverbowled;
        System.out.println("Current Run Rate"+truns);
        float rrate=(float)(totalruns-runsofar)/(float)(totalovers-noofoverbowled);
        System.out.println("Required Run Rate:"+rrate);



    }

}
