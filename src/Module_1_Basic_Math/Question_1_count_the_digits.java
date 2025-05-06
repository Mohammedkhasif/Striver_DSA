package Module_1_Basic_Math;
import java.util.*;

public class Question_1_count_the_digits {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
//            int lastdigit= n%10;
            count++;

            n=n/10;

        }
        System.out.println(count);


    }

}

