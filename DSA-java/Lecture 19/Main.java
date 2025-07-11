
// Q.1 Given an integer array a return the prefix sum/running sum in the same array without creating a new array



import java.util.*;

class Main {
	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);

		int [] arr={-1,3,22,11,10};
		System.out.println(Arrays.toString(check(arr)));


	}

	static int[] check(int[] arr){

		// int[] ans=new int[arr.length];
		// ans[0]=arr[0];
		for(int i=1; i<=arr.length-1; i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}

		return arr;
	}
}			