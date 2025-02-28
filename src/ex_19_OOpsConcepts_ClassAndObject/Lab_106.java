package ex_19_OOpsConcepts_ClassAndObject;

public class Lab_106 {
    public static void main(String[] args) {
        ATB10x lali = new ATB10x(); // the class is called and the class is loaded in class loader
                                   // obj new ATB10x(); is created and lali pointed to the object from Object Area
        ATB10x nithya = new ATB10x(); // same.

        lali.name="Lalitha";
        lali.age=30;
        lali.salary=100;
        lali.Address="Salem"; // here the obj reference lali uses the attributes of the class ATB10x.

        nithya.name="NithyaB";
        nithya.age=29;
        nithya.salary=101;
        nithya.Address="CBE"; // here the obj reference nithya also uses the attributes of the class ATB10x.

        System.out.println(lali.name+"\t" +lali.sleep());// ref lali uses the Attribute and behaviour sleep() of the class ATB10x
        System.out.println(nithya.name+"\t" +nithya.eat()); // ref Nithya uses the behaviour eat() of the class ATB10x

        // Class is the Blue print which has Attribute and Behaviours
        // Ojects are the instance of class or uses the blue print and create a real entity. Objects are the real entity.


    }

}
