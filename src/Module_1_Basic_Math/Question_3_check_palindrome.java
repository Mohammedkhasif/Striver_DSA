package Module_1_Basic_Math;
import java.util.*;

public class Question_3_check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revnum = 0;
        int duplicate = n;

        while(n>0){
            int lastdigit = n%10;
            revnum = (revnum*10)+ lastdigit;
            n= n/10;
        }
        if(duplicate == revnum ){
            System.out.println(("palindrome"));
        }
        else{
            System.out.println("not");
        }
    }

}
