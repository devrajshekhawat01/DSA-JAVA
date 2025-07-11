
// Q.2 Given an array of integer a move all the even integer at the beginning of the array followed by all the odd integer The realtive order of odd or even 

import java.util.Arrays;

public class SortedEvenOdd {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,77,12};
        System.out.println(Arrays.toString(checks(arr)));
    }

    static int[] checks(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        while (start<end) {

            if(arr[start]%2!=0 && arr[end]%2==0)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }

            if(arr[start]%2==0)
            {
                start++;
            }

            if(arr[end]%2!=0)
            {
                end--;
            }
            
        }

        return arr;
    }
}