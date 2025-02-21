package ex_16_Task_31JanJavaPrograms;
import java.util.*;
public class Lab_093_CalculateElectricityBill {
    // This program is to calculate electricity bill.
    public static void main(String[] args) {
        double amount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units of electricity consumed");
        if(!sc.hasNextDouble()){
            System.out.println("Enter the valid input");
        }
        else {
            double unit = sc.nextDouble();
            if (!(unit < 0)) {
                if (unit >= 0 && unit <= 100) {
                    amount = unit * 0.50;
                    System.out.println("Your electricity bill is rupees " + amount);
                } else if (unit >= 101 && unit <= 200) {
                    amount = unit * 0.75;
                    System.out.println("Your electricity bill is rupees " + amount);
                } else if (unit >= 201 && unit <= 300) {
                    amount = unit * 1.20;
                    System.out.println("Your electricity bill is rupees " + amount);
                } else {
                    amount = unit * 1.50;
                    System.out.println("Your electricity bill is rupees " + amount);
                }
            }
            else{
                System.out.println("The unit must be a positive number.");
            }
        }

    }
}
