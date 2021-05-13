package pl.mkluzniak;

public class Human {

    String name; //declaration of what attributes we will need
    int age;
    double weight;

    Human(String name, int age, double weight) {

        this.name = name; //declaration of method that changes attributes
        this.age = age;
        this.weight = weight;

    }

void eat(){
    System.out.println(this.name+" is eating!");

}
void drink(){
    System.out.println(this.name+" is drinking!");

}
}
