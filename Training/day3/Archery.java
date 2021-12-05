import java.util.Scanner;

    public class Archery {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Target : ");
            int score=0;
            int target = sc.nextInt();
            for (int i = 1; i <= target; i++) {
                System.out.println("Enter the turn " + i);
                int turn = sc.nextInt();
                score += turn;
                if (score >= target) {
                    System.out.println("No of turns :" + i);
                    break;
                }
            }
        }
    }