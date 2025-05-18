package Module_2_Basic_Recursion;
import java.util.*;

public class Question_4_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =SumofN(n);
        System.out.println(sum);
    }
    static int SumofN(int n){
        if(n==0)
            return 0;
        return n+ SumofN(n-1);
    }
}
