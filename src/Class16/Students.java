package Class16;

public class Students {
    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args) {
        Students onur=new Students();
        onur.name="Onur";
        onur.id="264";
        onur.noOfStudents++;

        Students nicole=new Students();
        nicole.name="Nicole";
        nicole.id="123";
        nicole.noOfStudents++;
        System.out.println(Students.noOfStudents);


    }
}
