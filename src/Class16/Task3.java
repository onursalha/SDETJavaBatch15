package Class16;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not

    return type=>void
    name =>isPalindrome
    parameters=> String inputStr
    {
    }


     */

    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" Not is palindrome");
        }


    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.isPalindrome("onur");
    }
}
