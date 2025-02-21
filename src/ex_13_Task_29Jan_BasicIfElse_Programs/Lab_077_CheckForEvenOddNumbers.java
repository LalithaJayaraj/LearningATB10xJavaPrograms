package ex_13_Task_29Jan_BasicIfElse_Programs;

import java.util.Scanner;

public class Lab_077_CheckForEvenOddNumbers {
//    This program is to check the given number is even or odd number using ternary operator.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    //using ternary operator Syntax: (Condition) ? Execute if true : Execute if false ;
    String result = (num%2 == 0)? "The number is Even" : " The number is Odd";
    System.out.println(result);
    sc.close();
}
}
