package Module_1_Basic_Math;
import java.util.*;

public class Question_4_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int duplicate = n;
        int sum = 0;

        while(n>0){
           int lastDigit = n%10;
           sum = sum+ (lastDigit*lastDigit*lastDigit);
           n= n/10;
        }
        if(duplicate == sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
