package ex_14_SelfTask_29JanCodingInterviewQuestions;

public class RightTriangleStarPattern {
// Write Program to get the Right Triangle Star Pattern.
// *
// **
// ***
// ****
// *****

    public static void main(String[] args) {
        for(int i=1;i<=5; i++)
        {
            for(int j=i; j>0; j--){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
