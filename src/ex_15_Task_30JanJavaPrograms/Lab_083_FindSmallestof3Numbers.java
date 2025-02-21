package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_083_FindSmallestof3Numbers {
    //This program is to find the smallest of 3 numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value for number2");
        int num2 = sc.nextInt();
        System.out.println("Enter the value for number3");
        int num3 = sc.nextInt();
        int a =(num1<num2)?num1:num2;
        a=(a<num3)?a:num3;
        System.out.println("The number "+a+" is the smallest number.");
        sc.close();
    }
}
