package Class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scanner.nextInt();


        System.out.println("You entered "+num);

        Methods methods=new Methods();
        //int num2= methods.doSomething();
        String java=methods.method2();
    }
}
