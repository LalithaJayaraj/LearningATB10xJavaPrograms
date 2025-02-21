package ex_17_Strings;

public class Lab_95_StringCreationType2 {
    public static void main(String[] args) {
        String s1 = "Lalitha"; // Method 1 String creation. Value is stored in String Constant Pool
        String s2 = new String("Lalitha");//Method 2 . Value is stores in Object Area
        if(s1==s2){ // operator == compares the address.
            System.out.println("Same");
        }
        else{
            System.out.println("Stored in diffrent address");
        }

        if(s1.equals(s2)){ //equals is a String function to compare only the value rather than the address.
            System.out.println("Value is equal");
        }
        else{
            System.out.println("Value is not equal");
        }

    }
}
