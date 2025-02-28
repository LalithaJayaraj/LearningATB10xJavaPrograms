package ex_19_OOpsConcepts_ClassAndObject;

public class PetAnimals {
    // Pet animal class that has main method.
    // We can have within a class

    public static void main(String[] args) {

        //creating 2 obj ref for the class Dog and now the class dog is loaded in class loader which is inside JVM.

        Dog pug = new Dog();
        Dog ret = new Dog();

        //Obj ref using the attributes of class Dog
        pug.name="CutiePie";
        ret.name="Goldie";

        pug.color="White";
        ret.color="Goldenbrown";

        System.out.println(pug.name+"\t"+pug.play());
        pug.sleep(); // calling method as it does not return any value.
        pug.bark();

        System.out.println(ret.name+"\t"+ret.play());
        ret.sleep(); // calling method as it does not return any value.




    }

    //Creating a dog class with Attributes and Behaviours.
    public static class Dog {

        // Attributes of Cat class
        String name;
        String color;

        //Behaviour;
        void bark(){
            System.out.println("Barks loudly");
        }
        void sleep(){
            System.out.println("Sleeps well");
        }
        String play(){
            return("pet him and he Plays well");

        }

    }
}
