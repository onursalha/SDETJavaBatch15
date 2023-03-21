package Class27;

public class Demo2 {

    public static void main(String[] args) {
        String name="Onur";
        String[] names={"Hiral","Nima","Laura","Nat", "Onur"};
        // create a method which can search a name from this array return true if name is present in the array
        System.out.println(contains(name,names));
        String[] arr= new String[2];






    }

    public static boolean contains(String nameToBeSearched,String[] names){
        for (String name:names) {
            if(nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }
}
