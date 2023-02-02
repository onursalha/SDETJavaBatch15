package Class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="1234abcaaAAABBBBCCCCABC#$%3456ghjfdjkhgabcabcabcaaacb";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]","#"));
    }
}
