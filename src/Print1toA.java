import java.util.Scanner;

public class Print1toA {
    public static String Num(int Start, int A){

        if(Start>A){
            System.out.println();
        }
        else{
            System.out.print(Start+" ");
             Num(Start + 1,A);
        }

        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int Start=1;
        System.out.println(Print1toA.Num(Start,A));

    }
}