package ex_20_OopsConcept_Constructors;

public class Lab_107_DefaultConstructor {
    //program for Creating a default constructor
    public static void main(String[] args) {
        Baby b = new Baby();

    }

    public static class Baby{
        String name="Vihaan";

        // A constructor is automatically called when an object is created.
        //Default constructor
        Baby(){
            System.out.println("Constructor is called. Baby is born and his name is "+name);
        }

        //Instance Initialization Block.(IIB). This is different to constructor.
        // This is the extra functionality. if needed this can be used or else not need to use this.
        // Where it is used? -> " if we need to Call database before working"
        {
            System.out.println("IIB- I'm also called when object is created.");
            System.out.println("Make database ready before starting the work");
        }

    }
}
