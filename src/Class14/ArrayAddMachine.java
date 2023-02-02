package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int[] array2={10,20,30,40,50};
        addArrayElements(array2);
        int [] array3={10,20,50,40,90};
        addArrayElements(array3);
    }

    static void addArrayElements(int [] arr){
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
