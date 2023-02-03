package Class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;
    public Student(String sName,String sId,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;

    }
    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
    public static void main(String[] args) {
        Student student1=new Student("Onur", "264", 25, 85);
        student1.printInfo();

    }


}
