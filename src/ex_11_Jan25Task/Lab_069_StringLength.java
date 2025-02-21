package ex_11_Jan25Task;

import java.util.Scanner;

public class Lab_069_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name");
        String name = sc.nextLine();
        System.out.println("Length of the string is"+name.length());
        System.out.println(name.charAt(6));

        sc.close();
    }
}
