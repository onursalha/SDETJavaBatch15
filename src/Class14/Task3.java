package Class14;

public class Task3 {
    public static void main(String[] args) {
        String str="Is it Saturday? Is it raining? Do  we have a Java class today?";
        String [] arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println(str.split("[?]").length);
    }
}
