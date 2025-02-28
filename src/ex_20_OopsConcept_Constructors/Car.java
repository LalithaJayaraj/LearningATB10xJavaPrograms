package ex_20_OopsConcept_Constructors;

public class Car {

    String name;
    String model;
    int year = 0;

    Car(){
        name="Unknown Car name";
        model="XXXX";
        year = 0;
        System.out.println("Default Constructor");
    }
}
