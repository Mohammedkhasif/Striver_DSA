package Module_2_Basic_Recursion;
import java.util.*;

public class Question_2_print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(1,n);

    }
    static void printNumbers(int current, int n){
        if(current> n){
            return;
        }
        System.out.println(current);
        printNumbers(current+1,n);
    }
}
