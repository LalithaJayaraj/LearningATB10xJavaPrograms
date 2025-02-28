package ex_20_OopsConcept_Constructors;

import java.io.FileInputStream;

public class Lab_108_DefaultConstructor2 {
    public static void main(String[] args) {
        //creating object from main method
        A a1 = new A();
        System.out.println(a1);

    }

    static class A{

        A(){
            System.out.println("Default Constructor is called");
            System.out.println("You can use the constructor before you start doing anything");
            System.out.println("Prepare the database");
            System.out.println("Load the Symbols before starting the work");
            System.out.println("Keep the file open ");
           // FileInputStream file1 = new FileInputStream("c:/a.log");
        }
    }
}
