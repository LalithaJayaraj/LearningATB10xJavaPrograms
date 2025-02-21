package ex_13_Task_29Jan_BasicIfElse_Programs;

import java.util.Scanner;

public class Lab_076_CheckForPositiveNegativeNumbers {
    // This program is tto check if the given number is positive or negative.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("The given number "+num+" is positive");
        }
        else{
            System.out.println("The given number " + num +" is negative");
        }
    }
}
