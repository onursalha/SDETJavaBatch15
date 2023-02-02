package Class16;

public class SyntaxEmployee {
    String empId;
    double salary;
   static String CEO="Sumair";


    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empId="S123";
        emp1.salary=100000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empId="S124";
        emp2.salary=120000;
        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

    }

}
