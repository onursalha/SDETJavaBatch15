package Class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

        System.out.println("Please Enter the item and its price");
        String intemName = sc.next();
        double itemPrice=sc.nextDouble();
        totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items ");
        double amountPaid=sc.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");

    }
}
