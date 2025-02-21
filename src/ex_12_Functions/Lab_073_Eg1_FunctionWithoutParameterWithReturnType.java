package ex_12_Functions;

public class Lab_073_Eg1_FunctionWithoutParameterWithReturnType {
    public static void main(String[] args) {
        // This program has user defined function votingAge() which has no parameters or Argument but has return type as int.

       int age = votingAge(); // Function is called here
        System.out.println("Voting Age is " + age);
    }

    // User defined function
    public static int votingAge(){
        return 18;
    }
}
