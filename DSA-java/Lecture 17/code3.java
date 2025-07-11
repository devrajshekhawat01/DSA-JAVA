
// Reverse an array consisting of integer values


// class code3{

// 	static int[] reverseArray(int []arr){
// 		int []ans= new int[arr.length];
// 		int j=0;

// 		for(int i=arr.length-1; i>=0;i--){
// 			ans[j]=arr[i];
// 			j++;
// 		}
// 		return ans;
// 	}

// 	public static void main(String[] args) {
// 		int []arr ={21,35,25,45,6};

// 		int [] res=reverseArray(arr);

// 		for(int k=0; k<res.length; k++){
// 			System.out.print(res[k]+" ");
// 		}
// 	}



// }







//? Methods 2

// public class code3{

// 	static void swaparray(int []arr, int i,int j){
// 		int temp = arr[i];
// 		arr[i]=arr[j];
// 		arr[j]=temp;
// 	}




// 	static void reverseArray(int []arr){
// 		int i=0, j=arr.length-1;

// 		while(i<j){
// 			swaparray(arr,i,j);
// 			i++;
// 			j--;
// 		}
// 	}


// 	public static void main(String[] args) {
		
// 		int []arr ={1,3,4,5,44};

// 		reverseArray(arr);

// 		for(int i=0; i<arr.length; i++)
// 		{
// 			System.out.print(arr[i]+" ");
// 		}

// 	}


// }







// Method 3

import java.util.Arrays;
public class code3 {
	public static void main(String[] args) {
		int[] arr ={44,84,7,23,55};
		int[] ans =check(arr);
		System.out.println(Arrays.toString(ans));
		
	}


	static int[] check(int[] arr)
	{
		int i=0; int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}

		return arr;
		
		
	}
}