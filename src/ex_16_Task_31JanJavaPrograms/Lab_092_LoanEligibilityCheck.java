package ex_16_Task_31JanJavaPrograms;
import java.util.*;
public class Lab_092_LoanEligibilityCheck {
    //This program is to check if the person is eligible for loan.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ageValidation = false;
        boolean SalaryValidation = false;
        boolean creditScoreCheck = false;
        System.out.println("Enter the Age");
        if(!(sc.hasNextInt())){
            System.out.println("Age must be an Integer");
        }
        else {
            int age = sc.nextInt();
            if (age <= 0) {
                System.out.println("Age should be a positive number.");
            } else if (age< 18) {
                System.out.println("Age must be greater than 18");
            }
            else if (age > 80) {
                System.out.println("Age must be less than 80");
            }
            else {
                ageValidation = true;
            }
        }
        System.out.println("Enter the Salary");
        if(!(sc.hasNextDouble())){
            System.out.println("Salary must be an Number");
        }
        else {
            double salary = sc.nextInt();
            if (salary <= 0) {
                System.out.println("Salary should be a positive number");
            } else if (salary<30000){
                System.out.println("Your Salary must be more than 30,000");
            }
            else{
                SalaryValidation = true;
            }
        }
        System.out.println("Enter the Credit Score");
        if(!(sc.hasNextInt())){
            System.out.println("Credit score must be an Number");
        }
        else {
            int credit_score = sc.nextInt();
            if (credit_score <= 0) {
                System.out.println("Credit score must be a positive integer");
            } else if (credit_score < 650 ) {
                System.out.println("You credit score should be more than 650");

            }
            else if (credit_score > 850) {
                System.out.println("You credit score should be more than 850");

            }
            else {
                creditScoreCheck = true;
            }
        }
        if(ageValidation && SalaryValidation && creditScoreCheck){
            System.out.println("Congratulations! You are eligible for loan");
        }
        else{

                System.out.println("You are not eligible for loan");
            }

        sc.close();
    }
}
