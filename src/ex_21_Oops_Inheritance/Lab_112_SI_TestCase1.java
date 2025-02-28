package ex_21_Oops_Inheritance;

public class Lab_112_SI_TestCase1 extends Lab_112_SI_CommonToAll{

    //extend keyword is used to inherit the Properties and Behaviours of the CommonToAll class.

    //Behaviours of Lab_112_SI_TestCase1 class.

    void runTestCase1(){
        startBrowser(); //TC1 class uses the behaviours of the CommonToAll class
        System.out.println("Running test case 1");
        closeBrowser(); //TC1 class uses the behaviours of the CommonToAll class
    }
}
