package Module_1_Basic_Math;
import java.util.*;

public class Question_6_print_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                count++;
                if((n/i)!= i) {
                    count++;
                }
            }

        }
        if(count ==2){
            System.out.println("primr");
        }
        else{
            System.out.println("not prime");
        }
    }
}
