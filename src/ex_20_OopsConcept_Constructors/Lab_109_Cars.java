package ex_20_OopsConcept_Constructors;

public class Lab_109_Cars {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name); // o/p will be Unknown car name as it takes the value from Default constructor.
        tesla.name="TESLA"; // Re-assigning the name to TESLA from Unknown Car.
        tesla.model="Cybertruck";
        tesla.year=2023;
        System.out.println("Car name " +tesla.name+"\n"+"Car Model "+tesla.model+"\n"+"Car Model-Year "+tesla.year);

        System.out.println("--------------");
        // Object 2 created.
        Car nano = new Car();
        System.out.println(nano.name); // o/p will be Unknown car name as it takes the value from Default constructor.
        nano.name="TATA Nano"; // Re-assigning the name to TATA Nano from Unknown Car.
        nano.model="Model1";
        nano.year=2010;
        System.out.println("Car name " +nano.name+"\n"+"Car Model "+nano.model+"\n"+"Car Model-Year "+nano.year);

    }
}
