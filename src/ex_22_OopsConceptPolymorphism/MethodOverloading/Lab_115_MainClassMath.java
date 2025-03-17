package ex_22_OopsConceptPolymorphism.MethodOverloading;

public class Lab_115_MainClassMath {
    public static void main(String[] args) {

        // creating object reference for MathOperation class.

        MathOperations m1 = new MathOperations();
        int r = m1.add(2,5);
        int r1=m1.add(5,5,5);
        double r2 = m1.add(3.5,2.5);
        // here the object reference m1 acts differently,
        // that is its calls out different add method based on the number of argument passed and also type of arg passed.
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);


    }
}
