package Class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;

        for (int i = 75; i <=100 ; i+=5) {
            System.out.println("I love summer because temparature is "+i);
        }
        System.out.println("Its very hot");


        System.out.println("************");


        int temp=75;

        while (temp<=105){
            if(temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else {
                System.out.println("Its very hot "+temp);
            }
            temp+=5;
        }
    }
}
