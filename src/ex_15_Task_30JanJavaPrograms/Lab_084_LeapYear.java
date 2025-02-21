package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_084_LeapYear {
    //program to find the year is a leap year.
    //The rules for leap years are:
    //Years that are evenly divisible by 4 are leap years
    //Years that are evenly divisible by 100 but not by 400 are not leap years
    //Years that are evenly divisible by 400 are leap years
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year%4 == 0 ){
            if(year%100 == 0) {
                if ((year % 400) == 0) {
                    System.out.println("The year " + year + " is a leap year");
                } else {
                    System.out.println("The year is not a leap year.");
                }

            }
            else{
                System.out.println("The year is a leap year");
            }
        }
        else{
            System.out.println("The year "+year+" is not a leap year");
        }
sc.close();
//        int year = 2000;
//        boolean isLeapYear = false;
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            isLeapYear = true;
//        }
//
//        if (isLeapYear) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }
//    }
//}

    }
}
