package ex_18_ArraysAnd2Darrays;

import java.util.Scanner;

public class Lab_100_DisplayingArrayItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int[] num={10,20,30,40,50};
        String[] st = {"Hello","World","is","Beautiful","!"};
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
            System.out.println(st[i]);
        }
        //getting integer input for array during runtime.

        for (int i=0; i<number.length;i++){
            System.out.println("Enter the value for the array of index" + i);
            number[i]=sc.nextInt();
        }
        for (int i=0; i<number.length;i++){
            System.out.println(number[i]);
        }

    }
}
