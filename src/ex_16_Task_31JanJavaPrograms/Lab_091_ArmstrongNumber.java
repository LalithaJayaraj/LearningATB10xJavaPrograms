package ex_16_Task_31JanJavaPrograms;
import java.util.*;
public class Lab_091_ArmstrongNumber {
    //This program is to find the armstrong number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int n = 0;
        for(int i = num; i>10; ){
            int q = i/10;
            i=q;
            n=n+1;
        }
        n=n+1;

        double Arm =0;
        int reminder =0;
        int Quotient =0;
        for(int j=num;j>10;){
             reminder = j%10;
             Quotient = j/10;
            j = Quotient;
            Arm = Arm + Math.pow((double)reminder,(double)n);
        }
        Arm = Arm+Math.pow((double)Quotient,(double)n);

        if(num == Arm){
            System.out.println("The number is Armstrong Number");
        }
        else{
            System.out.println("The number is not Armstrong Number");
        }
    }
}
