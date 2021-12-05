import java.util.Scanner;
public class Watermelon {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the watermelon weight:");
        int watermelon=sc.nextInt();
        if(watermelon%2==0){
            System.out.println("\nI get "+watermelon/2+ "kgs and my sibling gets "+watermelon/2+"kgs\n");
        }
        else {
            System.out.println("Sorry you can't get, look for even weight watermelon");
        }
        for(int i=1;i<watermelon;i++){
            System.out.println("possible ways to splitting "+i+" "+(watermelon-i));
        }
    }
}
