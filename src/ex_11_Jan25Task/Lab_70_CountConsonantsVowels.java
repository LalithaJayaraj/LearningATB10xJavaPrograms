package ex_11_Jan25Task;
import java.util.Scanner;
public class Lab_70_CountConsonantsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        int stringLength = name.length();
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<stringLength;i++){
 if( name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U'){
     vowels = vowels +1;

     }
 else {
     consonants = consonants +1;

      }

        }
        System.out.println("Number of Vowels is " + vowels);
        System.out.println("Number of Consonants is " + consonants);

    }
}
