package ex_25_SuperKeywordUsage;

public class Lab_121_SuperKeywordFatherSonExample {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();

    }
}


class Father{

    Father(){
        System.out.println("DC");
    }
    void home(){
        System.out.println("Father's home");
    }
}

class Son extends Father{

    Son(){
        super(); // calling Father's constructor using the super keyword .
    }

    void t1(){
        super.home(); // using super keyword to call father's method.
    }
    //super(); super keyword only works inside method or constructor.
    // super.home(); both the above and below is not allowed as they are not inside any methods or constructor.
}