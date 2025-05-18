package Module_3_Linear_Seaech_Array;

public class Question_2_Second_largest_element {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,5,6,12};
        System.out.println(SecondLargest(arr));


    }
    static int SecondLargest(int arr[]){
        int largest = arr[0];
        int Slargest = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]> largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && arr[i] > Slargest){
                Slargest =arr[i];

            }

        }
        return Slargest;
    }


}
