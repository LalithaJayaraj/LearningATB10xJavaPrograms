package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_087_PrimeNumber {

    //Program to check if the given number is prime number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int flag = 0;
        if(num<=1){
            System.out.println("The number " + num+" is not a prime number");
            flag = 1;
        }
        else{
            for(int i=2; i<num; i++) {

                if (num % i == 0) {
                    System.out.println("The number " + num+" is not a prime number");
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("The number " +num+" is a prime number");
            }
            }
            }

        }


