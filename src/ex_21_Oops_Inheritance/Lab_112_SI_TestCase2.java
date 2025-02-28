package ex_21_Oops_Inheritance;

public class Lab_112_SI_TestCase2 extends Lab_112_SI_CommonToAll{

    void runTestCase2(){
        startBrowser(); //TC2 class uses the behaviours of the CommonToAll class
        System.out.println("Running test case 2");
        closeBrowser(); //TC2 class uses the behaviours of the CommonToAll class
        readExcelFile();
        read_dataBaseFile();
    }
}
