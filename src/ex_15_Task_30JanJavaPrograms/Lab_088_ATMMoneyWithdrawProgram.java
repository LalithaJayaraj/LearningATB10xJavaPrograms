package ex_15_Task_30JanJavaPrograms;

import java.util.Scanner;

public class Lab_088_ATMMoneyWithdrawProgram {
    //Program to withdraw money from ATM
//    Steps to Write the Program
//
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//            2️⃣ Take user input for the amount they want to withdraw.
//            3️⃣ Check withdrawal conditions:
//
//    The amount should be greater than zero.
//
//    The amount should be a multiple of 100 (common ATM rule).
//
//    The amount should not exceed the account balance.
//            4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.
    public static void main(String[] args) {

        final int InitialBalance = 10000;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int withdrawalAmount = sc.nextInt();
        if((withdrawalAmount>0) && (withdrawalAmount%100==0) &&  withdrawalAmount<=InitialBalance) {
            int Balance = InitialBalance - withdrawalAmount;
            System.out.println("Cash Withdrawal is successful \nThe Available Balance is Rupees " +Balance);
        }
        else{
            System.out.println("Enter the correct Amount.");
        }
        sc.close();
    }
}
