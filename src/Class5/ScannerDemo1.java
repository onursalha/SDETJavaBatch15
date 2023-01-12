package Class5;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println();
        /*
        Scanner => Name of the class
        scan is just a variable like we create primitive variables
        = => assigment operator
        System.in=> tells the computer we want to read the data from keyboard.
         */

        /*System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" Years ol");


        System.out.println("Please enter your weight");
        double weight= scan.nextDouble();
        System.out.println(" your weight is "+weight+" Kgs");
        System.out.println("Are you hungry");
        boolean hungry= scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/


        /*System.out.println("Please Enter your gender");
        char gender=scan.next().charAt(1);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please enter your full name ");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);






    }
}
