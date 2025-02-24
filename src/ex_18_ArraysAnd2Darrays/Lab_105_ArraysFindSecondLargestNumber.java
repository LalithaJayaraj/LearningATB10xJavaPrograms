package ex_18_ArraysAnd2Darrays;
import java.util.*;
public class Lab_105_ArraysFindSecondLargestNumber {
    public static void main(String[] args) {
        int[] marks={50,60,57,80,90,89,70,60};
        Arrays.sort(marks);
        System.out.println("Second Largest number is " +marks[marks.length-2]);
    }
}
