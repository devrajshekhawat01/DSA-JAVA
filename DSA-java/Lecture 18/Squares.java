
// Q.3 Given an integer array a sorted in non decreasing order return an array of the square of each number sorted in non decreasing order

import java.util.Arrays;

public class Squares {

    public static void main(String[] args) {
        int [] arr={-10,-5,-2,1,4,9};
        System.out.println(Arrays.toString(checkSquare(arr)));
    }
    
    static int[] checkSquare(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int[] ans=new int[end+1];
        int k=0;



        while(start<=end)
        {
            if(Math.abs(arr[start])>Math.abs(arr[end]))
            {
                ans[k++]=arr[start]*arr[start];
                start++;
            }
            else{
                ans[k++]=arr[end]*arr[end];
                
                
                
                
                end--;
            }
            


            
        }

        


        return ans;
    }
}
