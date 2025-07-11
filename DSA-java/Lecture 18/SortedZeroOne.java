
// Q.1 Sort an array consisting of only 0s and 1s

import java.util.Arrays;

public class SortedZeroOne {
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,0,0,1,0,1,0,0,1,1};
        System.out.println(Arrays.toString(checks(arr)));
    }

    // static int[] checks(int[] arr)
    // {
    //     int count=0;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         if(arr[i]==0)
    //         {
    //             count++;
    //         }
    //     }

    //     for(int i=0; i<arr.length; i++)
    //     {
    //         if(count>0){
    //             arr[i]=0;
    //             count--;
    //         }
    //         else{
    //             arr[i]=1;
    //         }
    //     }



    //     return arr;
    // }





    static int[] checks(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if(arr[left]==1 && arr[right]== 0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

            if(arr[left]==0)
            {
                left++;
            }

            if(arr[right]==1)
            {
                right--;
            }
            
        }

        return arr;
    }
}