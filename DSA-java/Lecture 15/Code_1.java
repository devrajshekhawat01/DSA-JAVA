
import java.util.Scanner;

class code_1{

    static void printarray(int []arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +"        " );
        }

    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[8];

        System.out.println("Enter a number");

        for (int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }

        // for (int i=0; i<8; i++){
        //     System.out.print(arr[i] +"        " );
        // }

        int [] arr_2 = arr;

        arr_2[0]=0;
        arr_2[1]=0;

       code_1.printarray(arr_2);


    }
}