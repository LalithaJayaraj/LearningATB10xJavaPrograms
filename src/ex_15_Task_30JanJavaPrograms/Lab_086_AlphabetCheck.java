package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Lab_086_AlphabetCheck {
    // This program is to find if the given input is alphabet.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char alphabet = sc.next().charAt(0); // to get character as input using scanner.

        //Method 1
        if((alphabet >= 'a' && alphabet<= 'z') || (alphabet >= 'A' && alphabet<= 'Z'))
        {
            System.out.println("The given input "+ alphabet +" is an Alphabet");
        }
        else{
            System.out.println("The given input is not an Alphabet");
        }

//        Another method
//        if(isLetter(alphabet)){
//            System.out.println(" Its alphabet");
//        }
//        else{
//            System.out.println("Not alphabet");
//        }
    }
}
