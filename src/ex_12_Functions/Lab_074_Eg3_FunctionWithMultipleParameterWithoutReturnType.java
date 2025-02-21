package ex_12_Functions;

public class Lab_074_Eg3_FunctionWithMultipleParameterWithoutReturnType {

    // 3. With Parameter and without return type.
    public static void main(String[] args){
empDetails("Lalitha",30, 100);
empDetails("Nirmal", 34,2001);
empDetails("Vihaan", 3, 0);
    }

    static void empDetails(String name, int age, double Salary){
        System.out.println("Employee name is " + name +"\nAge is " + age + "\nSalary is "+Salary);

    }
    }
