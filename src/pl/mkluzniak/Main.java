package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)

        Human human1 = new Human("Rick", 65, 70); //declaration of attributes for human 1
        Human human2 = new Human("Morty", 16, 50); //declaration of attributes for human 2

        human2.eat(); //calling methods eat
        human1.drink(); //calling methods eat

//        System.out.println(human1.name);
//        System.out.println(human2.name);

    }
}
