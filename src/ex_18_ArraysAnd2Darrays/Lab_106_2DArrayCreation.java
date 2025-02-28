package ex_18_ArraysAnd2Darrays;

public class Lab_106_2DArrayCreation {
    public static void main(String[] args) {
        //Method1
        int[][] array2d1 = {{20,30,40},{10,15,20},{40,60,70}};

        //Method 2
        String[][] str = new String[3][3];
        str[0][0] ="Lalitha1";
        str[0][1] ="Lalitha2";
        str[0][2] ="Lalitha3";
        str[1][0] ="Nirmal1";
        str[1][1] ="Nirmal2";
        str[1][2] ="Nirmal3";
        str[2][0] ="Vihaan1";
        str[2][1] ="Vihaan2";
        str[2][2] ="Vihaan3";

        for (int i = 0; i < array2d1.length; i++) {
            for (int j = 0; j < array2d1.length; j++) {
                System.out.print(array2d1[i][j]);
                //System.out.println(str[i][j]);
                System.out.print(" | ");

            }
            System.out.println();
        }



    }
}
