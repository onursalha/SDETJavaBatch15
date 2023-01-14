package Class8;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Would you like to apply for a credit card?");

        for (int i = 1; i <=10; i++) {

            boolean card=scanner.nextBoolean();
            if (!card){
                System.out.println("Would you like to apply for a credit card?");
                continue;
            }else if (card){
                System.out.println("Congratulations");
            }
            break;


        }
    }
}
