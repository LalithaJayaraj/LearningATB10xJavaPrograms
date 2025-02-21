package ex_13_Task_29Jan_BasicIfElse_Programs;

import java.util.Scanner;

public class Lab_079_CheckForVowelConsonent {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    String Char = sc.next();
    String LCChar = Char.toLowerCase();
    if (LCChar.equals("a") || LCChar.equals("e")|| LCChar.equals("i") || LCChar.equals("o") || LCChar.equals("u"))
        {
        System.out.println("The Character " + Char + "  is a vowel");
    }
    else{
        System.out.println("The Character" + Char + " is consonent");
    }
    sc.close();
    }
}
