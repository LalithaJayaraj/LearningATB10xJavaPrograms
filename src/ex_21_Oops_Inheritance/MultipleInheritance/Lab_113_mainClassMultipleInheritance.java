package ex_21_Oops_Inheritance.MultipleInheritance;

public class Lab_113_mainClassMultipleInheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        s1.home(); // if Son dont have home it take's father's home. else GrandFather's home.
        s1.car();
        s1.property();
        s1.bike();

    }
}
