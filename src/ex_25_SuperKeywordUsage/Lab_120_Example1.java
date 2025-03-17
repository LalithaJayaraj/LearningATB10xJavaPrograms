package ex_25_SuperKeywordUsage;

class Example1 {
    public static void main(String[] args) {


    TestCase1 tc1 = new TestCase1("Chrome");
    TestCase1 tc2 = new TestCase1("Edge");
    tc1.openBrowser();
    tc1.startBrowser(2);
    tc2.openBrowser();
    tc2.startBrowser(2);
    }
}

class BasetoAll{
    String browser;

    BasetoAll(String browserC){
        this.browser=browserC;
    }

    void openBrowser(){
        System.out.println("Opening the browser"+ this.browser);
    }

    void closeBrowser(){
        System.out.println("Closing the browser "+ this.browser);
    }
    void startBrowser(){
        System.out.println("Starting the " + this.browser +"in 5 sec");
    }
    void startBrowser(int time){
        System.out.println("Starting the " + this.browser + " in " + time +"sec");
    }
}

class TestCase1 extends BasetoAll{
   TestCase1(String browser){
       super(browser);
   }

}