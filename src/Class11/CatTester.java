package Class11;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Lilo";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Black";
        cat1.attitude=true;
        cat1.eat();



        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.age=5;
        cat2.color="Black";
        cat2.attitude=true;


        cat1.eat();
        cat2.speak();

    }
}
