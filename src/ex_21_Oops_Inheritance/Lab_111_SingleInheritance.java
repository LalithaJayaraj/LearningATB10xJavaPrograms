package ex_21_Oops_Inheritance;

public class Lab_111_SingleInheritance {
    public static void main(String[] args) {
        Son jayaraj = new Son();
        jayaraj.bhk2(); // Son class can access behaviour of father class.
        int total_gold = jayaraj.father_goldGms + jayaraj.son_goldGms;
        System.out.println("Total gold Son has now is (both father and Son) ->"+total_gold);
    }

    //Father class
    public static class Father{
        int father_goldGms = 20;   //attribute of father

        void bhk2(){
            System.out.println("Father's 2bhk house");
        }
    }


    //Son class
    public static class Son extends Father{
        int son_goldGms=30; //attribute of Son

        void bhk3(){
            System.out.println("Son's 3 bhk house");
        }
    }
}
