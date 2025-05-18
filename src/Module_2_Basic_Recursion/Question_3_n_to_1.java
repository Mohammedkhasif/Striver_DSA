package Module_2_Basic_Recursion;
import java.util.*;

public class Question_3_n_to_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printreverse(n);

    }
    static void printreverse(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printreverse(n-1);
    }
}
