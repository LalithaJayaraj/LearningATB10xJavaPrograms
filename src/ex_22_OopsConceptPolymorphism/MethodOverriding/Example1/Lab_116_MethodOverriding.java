package ex_22_OopsConceptPolymorphism.MethodOverriding.Example1;

public class Lab_116_MethodOverriding {
    public static void main(String[] args) {

        Father f1 = new Father();
        Child c1 = new Child();
        Father f2 = new Child();// Dynamic dispatch. When child is born, Father is present.
        // Child c2 = new Father(); this is not possible. When father is born, child is not present.
              f1.home();
              c1.home();
              f2.home(); // Father reference can access child class object method with same name.
        // f2.c1(); not possible as only home method is overridden and only that can be called by father reference f2.
    }
}
