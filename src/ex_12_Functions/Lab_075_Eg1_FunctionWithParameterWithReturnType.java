package ex_12_Functions;

public class Lab_075_Eg1_FunctionWithParameterWithReturnType {
    public static void main(String[] Args){
int AddResult = calculation("add",20,10);
int SubResult = calculation("sub",20,10);
double mulResult = calculation("mul",50,7);
double divResult = calculation("div",50,7);
double modResult = calculation("mod",50,7);
        System.out.println(" Result of addition is "+AddResult);
        System.out.println(" Result of Subtraction is "+SubResult);
        System.out.println(" Result of Multiplication is "+mulResult);
        System.out.println(" Result of Division is "+divResult);
        System.out.println(" Result of Modulus is "+modResult);

    }
    public static int calculation(String calc,int a , int b){

   int c =0;
        switch(calc){
            case "add": { c = a+b;
                        break;}
            case "sub":{ c = a-b;
                        break;}
            case "mul":{ c= a*b;
                         break;}
            case "div":{ c= a/b;
                        break;}
            case "mod":{ c= a%b;
                        break;}
        }
return c;
    }
}
