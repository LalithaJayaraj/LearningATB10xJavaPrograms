package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_082_FindSmallestof2Numbers {
    //This program is to find the largest of 2 numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value for Number 2");
        int num2 = sc.nextInt();
        int a = Math.min(num1,num2);
        System.out.println("The number "+a+" is the smallest number.");
sc.close();
    }
}
