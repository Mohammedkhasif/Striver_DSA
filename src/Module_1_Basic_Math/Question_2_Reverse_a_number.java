package Module_1_Basic_Math;
import java.util.*;

public class Question_2_Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revnum = 0;
        while(n>0){
            int lastdigit = n%10;
            revnum = (revnum*10)+ lastdigit;
            n = n/10;
        }
        System.out.println(revnum);
    }
}
