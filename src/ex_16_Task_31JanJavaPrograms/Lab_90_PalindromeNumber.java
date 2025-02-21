package ex_16_Task_31JanJavaPrograms;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Lab_90_PalindromeNumber {
    // Program to check if the number is palindrome.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        final int num = sc.nextInt();
        int mod, Quotient = 0;
        int revNum =0;
        for (int i=num; i>10;){
            mod = i%10;
            Quotient = i/10;
            i = Quotient;
            revNum = (revNum*10) +(mod*10) ;
        }
          revNum=revNum+Quotient;
        if(revNum == num){
            System.out.println("The number is a Palindrome");
        }
        else {
            System.out.println("The number is not a Palindrome.");
        }
        }

    }
