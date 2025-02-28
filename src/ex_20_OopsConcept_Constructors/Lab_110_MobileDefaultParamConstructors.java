package ex_20_OopsConcept_Constructors;

public class Lab_110_MobileDefaultParamConstructors {
    public static void main(String[] args) {
        Mobile nokia = new Mobile();//initialises default constructor
        Mobile realme = new Mobile("Realmep1",2024); // Initialised/calls the parameterised constructor
        Mobile iphone = new Mobile("iphone16",2023);// automatically invokes parameterised constructor.
        realme.display();
        iphone.display();
    }


    static class Mobile{

        String Model_name;
        int Model_year;

        //Default constructor.
        Mobile(){
            System.out.println("Default constructor");
        }

        //Parameterised constructor

        Mobile(String Model_NameC, int Model_numberC){
            System.out.println("Parameterised constructor");
            this.Model_name =Model_NameC;
            this.Model_year=Model_numberC;
        }

        void display(){
            System.out.println("Model name "+ this.Model_name + "\n"+ "Model number "+ this.Model_year);
        }
    }
}
