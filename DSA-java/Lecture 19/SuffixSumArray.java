
// WAP to find the suffix array in the same array.

import java.util.*;
class SuffixSumArray {
	public static void main(String[] args) {
		
		int [] arr={2,4,7,5,6,1,9,3};
		System.out.println(Arrays.toString(check(arr)));
		System.out.println();

	}

	static int[] check(int[] arr)
	{
		for(int i= arr.length-2; i>=0; i--)
		{
			arr[i]=arr[i]+arr[i+1];
		}
		return arr;
	}
}