package ex_17_Strings;

import java.sql.SQLOutput;

public class Lab_96_StringAndChar {
    public static void main(String[] args) {
        char a = 'A'; // declaring a character with single quotes''.

        String s1 = "Lalitha"; // String is denoted or declared with "" double quotes.
        System.out.println(s1);
        System.out.println(s1.toLowerCase()); // Coverts string to lower case
        System.out.println(s1.toUpperCase()); // Coverts string to Upper case
        System.out.println(s1.concat("Jayaraj")); // Joins or concats the string available in SCP unpointed.

        String s2 = "   Hello World!  ";
        System.out.println(s2.trim()); // Trims the space in the beginning and at the end of the sequence.

        System.out.println(s2.replace("World","Lalitha")); // replaces the word Lalitha in the place of World
        System.out.println(s2.length()); // gives the length of the string
        System.out.println(s1.charAt(0)); // Gives the character present at the mentioned index.
        System.out.println(s2.contains("Lalitha")); // Checks if the word Lalitha in the s2 sequence.
        String s3="Jayaraj";
System.out.println(s3.equalsIgnoreCase("JAYaRAJ")); // checks and returns true or false if the strings matches by ignoring the case.
        System.out.println( s2.substring(3,8)); // in Params 3 is the starting index and 8 is the index -1 until we need.
 String s5="Name";
        System.out.println(s5.startsWith("N")+" it starts with the letter N"); // to check if the string starts with N
        System.out.println(s5.endsWith(".")+ "It ends with a dot");
        String s6 = "NAME";
        System.out.println(s5.compareTo(s6)); // Compares the string with unicode and lexicography and returns result 0 if both the strings are equal.

    }
}
