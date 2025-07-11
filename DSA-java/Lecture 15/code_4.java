
// copy of the array by arrays function

import java.util.*;

class code4{

    static void printarray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

public static void main (String[]args)
{

int []arr = new int[5];

arr[0]=2;
arr[1]=4;
arr[2]=3;
arr[3]=7;
arr[4]=5;

// int []arr_2 = Arrays.copyOf(arr , arr.length);
// int []arr_2 = Arrays.copyOf(arr , 3);   // number of element are copy
int []arr_2 = Arrays.copyOfRange(arr , 1 ,  5); 


// arr_2[0]=9;
// arr_2[1]=9;

System.out.print("Old array is : ");
printarray(arr);
System.out.println(" ");

System.out.print("new array is : ");
printarray(arr_2);




}
}