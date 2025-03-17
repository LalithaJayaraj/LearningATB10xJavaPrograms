package ex_22_OopsConceptPolymorphism.MethodOverriding.Example2;

import java.util.Collections;

public class RealExample {
    public static void main(String[] args) {
    TC1 tc1 = new TC1();
    TC2 tc2 = new TC2();
    tc1.startTC();
    tc2.openBrowser();

    }
}

class CommonToAll{

    // Behaviour of Commontoall class

    void openBrowser(){
        System.out.println("Start the browser in 5 seconds");
    }
}

class TC1 extends CommonToAll{
    void startTC(){
        openBrowser();
    }


}

//class TC2 copies/uses the method from commontoall class and alters the property to its need.
//This is called MethodOverriding.
class  TC2 extends CommonToAll{
    @Override //Override keyword is used while overriding the method/function/behaviour
    void openBrowser(){
        System.out.println("Start the browser in 2 seconds");
    }
}

