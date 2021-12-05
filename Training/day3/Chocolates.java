import java.util.Scanner;
public class Chocolates {
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of chocolates:");
        int Chocolates=sc.nextInt();
        System.out.println("Enter the No.of children:");
        int Children=sc.nextInt();
        for(int i=1;i<Children;i++){
            if(Chocolates>=i){
                Chocolates=Chocolates-i;
                count++;
            }
        }
        System.out.println("Chocolates remaining:"+Chocolates);
        System.out.println("No.of children who got the Chocolates:"+count);


    }
}
