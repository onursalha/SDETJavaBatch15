package Class7;

public class WhileRecap {
    public static void main(String[] args) {
        int number=10;
        while (number<=20){
            System.out.println(number);
            if(number<15){
                System.out.println("Number is still less than 15");
            }else{
                System.out.println("Numbuer is greater than 15 now");
            }
            number+=2;
        }
    }
}
