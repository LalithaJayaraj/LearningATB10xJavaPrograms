package ex_18_ArraysAnd2Darrays;

public class Lab_104_reverseArrayMethod1 {
    public static void main(String[] args) {
        int[] mark = {10,20,30,40,50};

        for(int i=mark.length-1,j=0;i>=0;i--,j++){
                int[] mark_new = new int[mark.length];
                mark_new[j]=mark[i];
                System.out.println(mark_new[j]);

        }
    }
}
