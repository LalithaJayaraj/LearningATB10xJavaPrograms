package ex_17_Strings;

public class Lab_98_StringBuilder_StringBuffer {
    public static void main(String[] args){

        StringBuffer stringbuff = new StringBuffer ("Lalitha"); // String is created using StringBuffer class
        stringbuff.append("Jayaraj"); // append operation. Mutable string. stores in same stringbuff reference
        System.out.println(stringbuff); // String Buffer is more thread safe and has Synchronization.
        stringbuff.reverse(); // reversing the result. this can be used for palindrome.
        System.out.println(stringbuff);

        StringBuilder sb = new StringBuilder("Hello");//new keyword is used so the string is saved in Heap Area-> Object area.
        sb.append("World"); // String Builder abd buffer are classes and does similar operation.
        System.out.println(sb); // String Builder is less thread safe and lack of Synchronization.
        sb.reverse();
        System.out.println(sb);
    }
}
