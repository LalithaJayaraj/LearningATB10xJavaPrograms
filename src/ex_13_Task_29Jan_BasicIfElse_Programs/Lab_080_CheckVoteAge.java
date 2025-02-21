package ex_13_Task_29Jan_BasicIfElse_Programs;

import java.util.Scanner;

public class Lab_080_CheckVoteAge {
    //This program is to check if the person is eligible for voting.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
