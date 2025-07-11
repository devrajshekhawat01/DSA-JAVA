

// Rotate the given array a by k steps where k is non negative 

//? Note k can be greater than n as well

//! without using any extra array

// import java.util.Arrays;
// public class RotateArrayKstep {
//     public static void main(String[] args) {
//         int[] arr ={44,84,7,23,55};
// 		int[] ans =Reverse(arr,3);
// 		System.out.println(Arrays.toString(ans));
//     }


//     static int[] Reverse(int[] arr, int k)
//     {
//         int i=0; int j=arr.length-1;
// 		while(i<j)
// 		{
// 			int temp=arr[i];
// 			arr[i]=arr[j];
// 			arr[j]=temp;
// 			i++;
// 			j--;
// 		}


//         i=k;
//         j=arr.length-1;
// 		while(i<j)
// 		{
// 			int temp=arr[i];
// 			arr[i]=arr[j];
// 			arr[j]=temp;
// 			i++;
// 			j--;
// 		}


//         return arr;
//     }
// }




//? mam ka answer
//! using an extra array

import java.util.Arrays;
public class RotateArrayKstep {
    public static void main(String[] args) {
        int[] arr={22,3,11,44,55};
        System.out.println(Arrays.toString(Reverse(arr,2)));
    }


    static int[] Reverse(int[] arr,int k)
    {
        int n = arr.length;
        k=k%n;

        int [] ans =new int[n];
        int j=0;

        for (int i=n-k; i<n; i++)
        {
            ans[j]=arr[i];
            j++;
        }

        for (int i=0; i<=n-k-1; i++)
        {
            ans[j]=arr[i];
            j++;
        }

        return ans;
    }
}