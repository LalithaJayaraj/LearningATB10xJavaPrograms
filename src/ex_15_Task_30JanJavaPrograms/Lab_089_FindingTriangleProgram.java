package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_089_FindingTriangleProgram {
    // This program is to find if the triangle is acute, right angle or obtuse triangle
    // Equilateral Triangle has all the three sides equal.
    //Isosceles triangle has two sides equal.
    //Scalene triangle has no equal sides.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side1");
        float side1 = sc.nextFloat();
        System.out.println("Enter the value for side2");
        float side2 = sc.nextFloat();
        System.out.println("Enter the value for side3");
        float side3 = sc.nextFloat();
        if(side1 == side2 && side2==side3 && side3==side1){
            System.out.println("The triangle is a Equilateral Triangle");
        }
        else if(side1 == side2 || side2==side3 || side3==side1){
            System.out.println("The triangle is a isosceles triangle");
        }
        else{
            System.out.println("The triangle is Scalene triangle");
        }
        sc.close();
    }
}
