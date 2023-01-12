package Class5;

public class LogicalOperators {
    public static void main(String[] args) {


        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);

        boolean boughtCho=false;
        boolean boughtFlowers=false;
        if (boughtCho||boughtFlowers){
            System.out.println("I am happy");
        }else {
            System.out.println("I am sad");
        }

        boolean wifi=false;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or 5G");
        }

    }
}
