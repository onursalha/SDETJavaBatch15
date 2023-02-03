package Class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        String[][] thomsonTrain=new String[3][3];
        String[] cabin0={"K","L","M"};
        String[] cabin1={"X","Y","Z"};
        String[] cabin2={"A","B","C"};


        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
        System.out.println(thomsonTrain[2][0]);
        System.out.println(Arrays.toString(thomsonTrain[0]));




    }
}
