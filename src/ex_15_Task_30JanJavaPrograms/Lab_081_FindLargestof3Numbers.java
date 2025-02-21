package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_081_FindLargestof3Numbers {
    //This program is to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value for number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the value for number 3");
        int num3 = sc.nextInt();
        int a = (num1>num2)?num1:num2;
        a = (a>num3)?a:num3;

        System.out.println("The number "+a+" is the largest number.");

    }
}
