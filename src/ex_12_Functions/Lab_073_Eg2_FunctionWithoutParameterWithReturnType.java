package ex_12_Functions;
import java.util.*;
public class Lab_073_Eg2_FunctionWithoutParameterWithReturnType {
    public static void main(String[] args){
       // This program gets input from the user for age and returns the value from the function.
        if (votingAge() >=18 ){ // calls the function here
            System.out.println("You are Eligible to vote " );
        }
        else{
            System.out.println(" You are not eligible to vote");
        }

    }
    //User defined function
    public static int votingAge(){
        System.out.println("Enter your age");
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }

}
