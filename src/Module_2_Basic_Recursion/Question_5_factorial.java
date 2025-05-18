package Module_2_Basic_Recursion;
import java. util.*;

public class Question_5_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Factorial(n) ;
        System.out.println(result);
    }
    static int Factorial(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
}
