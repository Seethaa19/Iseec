import java.util.Scanner;
public class Discount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of product 1: ");
        int product1_price = sc.nextInt();

        System.out.println("Enter the price of Product 2: ");
        int product2_price = sc.nextInt();

        System.out.println("Enter the price of Product 3: ");
        int product3_price = sc.nextInt();

        float total_cost = product1_price + product2_price + product3_price ;
        System.out.println("The Total cost of the products is " + total_cost);

        float offer1 = (float) ((20.00/100.00) * total_cost) ;
        System.out.println("Offer 1 price is " + offer1);

        float offer2 ;

        if(product1_price < product2_price){
            if(product3_price<product1_price){
                offer2= product3_price;
            }
            else{
                offer2= product1_price;
            }
        }
        else{
            if(product2_price < product3_price){
                offer2= product2_price;
            }
            else {
                offer2= product3_price;
            }
        }
        System.out.println("The Least cost product is " + offer2);

        double offer1_price= total_cost - offer1;
        System.out.println("Offer 1 payable amount: " + offer1_price);

        double offer2_price= total_cost - offer2;
        System.out.println("Offer 2 payable Amount: " + offer2_price);
    }
}