package ex_11_Jan25Task;

import java.util.Scanner;

public class Lab_071_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String to check for palindrome");
        // to get string input from the console
        String Name = sc.next();
        // to find the length of thr string
        int length = Name.length() - 1;
        System.out.println("length of the string"+length);
        String reverseName = "";
        for(int i=length; i >= 0; i--) {
            reverseName = reverseName + Name.charAt(i); // This will reverse and concatinate
        }
if(reverseName.equals(Name)){
    System.out.println("the String is Palindrome");
}
else{
    System.out.println("String is not a palindrome");
}
    }
}
