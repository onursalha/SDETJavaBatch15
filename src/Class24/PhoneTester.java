package Class24;

public class PhoneTester {

    public static void main(String[] args) {

        Phone [] phones={new Samsung(),new Iphone()};

        /*for (Phone po:phones){
            po.unlockPhone();
            po.SendText();
            po.displayPictures();
        }*/

        for (int i = 0; i < phones.length; i++) {
            phones[i].unlockPhone();
            phones[i].SendText();
            phones[i].displayPictures();


        }
}
}
