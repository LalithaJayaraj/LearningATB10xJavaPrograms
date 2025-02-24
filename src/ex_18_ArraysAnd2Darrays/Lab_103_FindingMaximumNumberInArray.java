package ex_18_ArraysAnd2Darrays;

public class Lab_103_FindingMaximumNumberInArray {
    public static void main(String[] args) {
        int[] marks ={10,3,50,200,78,28};
int maximum_num = find_max(marks);

        System.out.println(maximum_num);
    }
    public static int find_max(int[] mark)
    {
        int max = mark[0];
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > max) {
                max = mark[i];
            }
        }
      return max;
    }
}
