
// Q.2 Given an array of integer of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 to r (both included)

// Note : The values of l and r in queries follow 1-based indexing

import java.util.*;
class QueriesQuestion {
	public static void main(String[] args) {
		
		System.out.print("Enter size of the array :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n+1];
		System.out.println("Enter element of the array :");
		for(int i=1; i<=n; i++)
		{
			arr[i]=sc.nextInt();
		}

		check(arr);

		System.out.println("Enter number of query :");
		int q=sc.nextInt();

		while (q>0) {
			System.out.println("Enter the r and l");
			int r=sc.nextInt();
			int l=sc.nextInt();

			System.out.println("Sum is :"+(arr[l]-arr[r-1]));


			q--;
			
		}




	}


	static void check(int[] arr){

		for(int i=1; i<=arr.length-1; i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}

	}
}