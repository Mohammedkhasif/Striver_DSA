package Module_2_Basic_Recursion;

public class Question_1_basic_Recursion {
    public static void main(String[] args) {
        printName(1);

    }
    static void printName(int count){
        if(count>5){
            return;

        }
        System.out.println("khasif");
        printName(count+1);
    }
}
