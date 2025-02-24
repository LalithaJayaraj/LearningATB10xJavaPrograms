package ex_18_ArraysAnd2Darrays;

import java.util.Arrays;

public class Lab_102_SortingInArray {
    public static void main(String[] args) {
        int[] marks ={10,3,50,20,78,28};
        Arrays.sort(marks);

        for(int i: marks){ //for each loop. value of marks is assigned to i and i is displayed. i goes increment order
            System.out.println(i);
        }
    }
}
