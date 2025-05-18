package Module_3_Linear_Seaech_Array;

public class Question_1_Largest_Element {
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,78,8,88};
        int result = Largest(arr);
        System.out.println(result);

    }
    static int Largest(int arr[]){
        int largest = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }

        }
        return largest;
    }
}
