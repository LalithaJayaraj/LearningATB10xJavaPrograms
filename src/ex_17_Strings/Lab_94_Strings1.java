package ex_17_Strings;

public class Lab_94_Strings1 {
    public static void main(String[] args){
        String s1 = " Lalitha";
        s1.concat("Jayaraj"); // Two strings will be present now in SCP and s1 points out originally to "Lalitha"
        System.out.println(s1); // if we print s1 only Lalitha is printed and not the concatinated value.
       s1= s1.concat("Jayaraj"); // the result is now stored or s1 is pointing out to the concatinated value.
        System.out.println(s1); // prints concatinated value.

    }
}
