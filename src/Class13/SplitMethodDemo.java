package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like Java. i write a lot of code daily. I am from Batch 15.";
        String []strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
