package ex_18_ArraysAnd2Darrays;

public class Lab_101_ArrayStringBoolean {
    public static void main(String[] args) {
        String[] str = {"lalitha","Indhu","Agalya"}; // Method 1 String array
        String[] str2 = new String[4]; // Method 2 String array creation
        str2[0]="Dad";
        str2[1]="Mom";
        str2[2]="Son";
        str2[3]="Daughter";
        System.out.println(str2.length);

        boolean[] bl = {true,false}; // Method1 Boolean array creation
        System.out.println(bl[0]);
        System.out.println(bl[1]);
        boolean[] bool = new boolean[2]; //Method2 creating Boolean array
        bool[0]=true;
        bool[1]=false;
    }
}
