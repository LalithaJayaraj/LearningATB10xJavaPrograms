package ex_13_Task_29Jan_BasicIfElse_Programs;

import java.util.Scanner;

public class Lab_078_FindMaxOfTwoNumbers {
    //This program is to find maximum of two numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("The number " + num1 + " is greater");
        } else {
            System.out.println("The number " + num2 + " is greater");
        }
    }

}