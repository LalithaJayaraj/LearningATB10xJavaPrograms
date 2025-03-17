package ex_22_OopsConceptPolymorphism.MethodOverloading;

public class MathOperations {

    //Behaviour1

    int add(int a, int b){
        return a+b;
    }

    //Behaviour2(both function name(add) are same here)

    int add(int a , int b, int c){
        return a+b+c;
    }

    double add (double a, double b){
        return a+b;
    }
}
