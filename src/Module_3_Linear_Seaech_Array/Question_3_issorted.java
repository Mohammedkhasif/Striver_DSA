package Module_3_Linear_Seaech_Array;
import java.util.*;

public class Question_3_issorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println(issorted(arr,n));

    }
    static boolean issorted(int arr[], int n){
        for (int i = 1; i <n ; i++) {
            if(arr[i]>= arr[i-1]){

            }
            else{
                return false;
            }

        }
        return true;
    }
}
