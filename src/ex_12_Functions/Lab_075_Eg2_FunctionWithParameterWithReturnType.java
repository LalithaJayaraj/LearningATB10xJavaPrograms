package ex_12_Functions;
import java.util.*;
public class Lab_075_Eg2_FunctionWithParameterWithReturnType {
    public static void main(String[] Args){
        /*With multiple Parameter and with return type
        Takes user inputs a , b
        Calculates +,-,*,/,% in the user defined function using switch statement.
        Edge cases used are 1. checking for Integer while scanning input
        2. Checks if for any 0 in the input.
        */


        Scanner sc = new Scanner(System.in);
        int a =0;
        int b =0;
        System.out.println("Enter the value for a");
        if(sc.hasNextInt()){
        a = sc.nextInt();}
        else{
            System.out.println("Enter only integer");
            System.exit(0); // this terminates the program
        }
        System.out.println("Enter the value for b");
        if(sc.hasNextInt()){
        b = sc.nextInt();}
        else{
            System.out.println("Enter only integer");
            System.exit(0);
        }

        int AddResult = calculation("add",a,b);
        int SubResult = calculation("sub",a,b);
        double mulResult = calculation("mul",a,b);
        double divResult = calculation("div",a,b);
        double modResult = calculation("mod",a,b);

        System.out.println(" Result of addition is "+AddResult);
        System.out.println(" Result of Subtraction is "+SubResult);
        System.out.println(" Result of Multiplication is "+mulResult);
        System.out.println(" Result of Division is "+divResult);
        System.out.println(" Result of Modulus is "+modResult);

    }
    public static int calculation(String calc,int a , int b){

        int c =0;

            switch (calc) {
                case "add": {
                    c = a + b;
                    break;
                }
                case "sub": {
                    c = a - b;
                    break;
                }
                case "mul": {
                    c = a * b;
                    break;
                }
                case "div": {
                    if(a!=0 && b!=0) {
                        c = a / b;
                    }
                    else{
                        System.out.println("Exit with code 130");
                    }
                    break;
                }
                case "mod": {
                    if(a!=0 && b!=0) {
                        c = a % b;
                    }
                    else{
                        System.out.println("Exit with code 130");
                    }
                    break;
                }
            }

        return c;
    }
}
