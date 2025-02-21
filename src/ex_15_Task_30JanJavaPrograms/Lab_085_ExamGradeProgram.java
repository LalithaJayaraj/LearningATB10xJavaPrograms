package ex_15_Task_30JanJavaPrograms;
import java.util.*;
public class Lab_085_ExamGradeProgram {
    public static void main(String[] args) {


    // This program is to generate grade for the given marks.
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your mark");
    int mark = 0;
    if(sc.hasNextInt()) {
        mark = sc.nextInt();}
        boolean ValidCheck = mark >=0 && mark<=100;
       if(ValidCheck) {
           if(mark >=90){
               System.out.println("Your Grade is A+");
           }
           else if(mark >=80 && mark<=89){
               System.out.println("Your grade is A");
           }
           else if(mark >=70 && mark<=79){
               System.out.println("Your grade is B");
           }
           else if(mark >=60 && mark<=69){
               System.out.println("Your grade is C");
           }
           else if(mark >=50 && mark<=59){
               System.out.println("Your grade is D");

           }
           else{
               System.out.println("Try in next attempt");
           }
       }

    else
    {
        System.out.println("Enter the valid marks");
    }

    }
}
