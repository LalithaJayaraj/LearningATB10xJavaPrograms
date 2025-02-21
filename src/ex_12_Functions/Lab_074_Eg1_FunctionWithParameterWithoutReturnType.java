package ex_12_Functions;

public class Lab_074_Eg1_FunctionWithParameterWithoutReturnType {
    public static void main(String[] args){
        //This program has user defined function that receives parameter and has no return type.
        String item = "Soap";
        int amt = 15;
        departmentalStore(item,amt); // Parameters passed to the function when it is called.
    }

    //User defined function that receives value as parameters.
    public static void departmentalStore(String name, int rupees){
        System.out.println("Received the amount "+ rupees + " for the item " + name);

    }
}
