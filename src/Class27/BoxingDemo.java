package Class27;

public class BoxingDemo {

    public static void main(String[] args) {

        int number=15;
        printData(number);

        Integer f=10;  // autoBoxing
        int number2=f;
        System.out.println(number2);
    }

    public static void printData(Integer number){
        System.out.println(number);
    }
}
