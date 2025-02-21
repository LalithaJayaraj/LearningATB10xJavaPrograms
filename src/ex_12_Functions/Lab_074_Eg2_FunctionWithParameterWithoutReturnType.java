package ex_12_Functions;

public class Lab_074_Eg2_FunctionWithParameterWithoutReturnType {
    // Program to calculate sum, sub, div , mod and mul of two integers using function by passing the values as parameter without return type.
    public static void main(String[] args) {
        calculation(20,10);
    }

    static void calculation(int a , int b){
        System.out.println("Addition of two value " + a +" and "+b +" is "+ (a+b));
        System.out.println("Subtraction of the value " + a + " and "+b +"  is "+ (a-b));
        System.out.println("Division of of the value " + a + " and " +b +" is "+ (a/b));
        System.out.println("Multiplication of the value " + a + " and " +b +" is "+ (a*b));
        System.out.println("Modulus of the value " + a + " and " +b +"  is "+ (a%b));
    }

}
