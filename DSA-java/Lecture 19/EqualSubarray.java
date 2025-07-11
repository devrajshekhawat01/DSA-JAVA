
// Q.3 Check if we can partion the array into two subarrays with equal sum. More formally check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.


import java.util.*;

class EqualSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter element of the array :");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		

		// prefix sum calculated in the array
		check(arr);

		System.out.println(EqualCheck(arr));



	}



	static void check(int[] arr){

		for(int i=1; i<=arr.length-1; i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}

	}


	static boolean EqualCheck(int[] arr)
	{
		for (int i=0;i<arr.length-2 ;i++ ) {
			if(arr[i]==(arr[arr.length-1]-arr[i]))
			{
				return true;
			}
			
		}

		return false;
	}
}