package ex_17_Strings;

public class Lab_97_StringBulilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Lalitha");
        System.out.println(sb);
        sb.append("Jayaraj");
        System.out.println(sb);// it appends the second string and stores in sb. it does dynamic string manipulation.
      sb.append("AgalyaIndhuMani");
        System.out.println(sb);
    }
}
