

// Method 3 : Prefix sum over columns and Rows Both

class Ques3 {
	
	public static void main(String[] args)
	{
		int[][] arr = {
			{1,2,3,4,5},
			{6,6,2,3,1},
			{3,4,1,3,1},
			{3,4,6,8,1},
			{4,5,2,4,2}				
		};
		
		System.out.println(findSum3(arr,1,0,4,4));
	}
	
	
	static int findSum3(int[][] arr, int l1, int r1, int l2, int r2)
	{
		int ans=0, sum=0, up=0, left=0, upleft=0;
		findPrefixSumMatrix(arr);
		
		sum = arr[l2][r2];
		
		if (r1>=1) {
			left=arr[l2][r1-1];
		}
		
		if (l1 >= 1) {
			up = arr[l1-1][r2];
		}
		
		if (l1 >=1 && r1 >= 1) {
			upleft= arr[l1-1][r1-1];
		}
		
		ans=sum-up-left+upleft;
		
		
		return ans;
		
	}
	
	// calculate row and column wise prefix sum
	static void findPrefixSumMatrix(int[][] matrix)
	{
		int r = matrix.length;
		int c = matrix[0].length;
		
		// travel horizently to calculate row wise prefix sum
		
		for (int i=0; i<r; i++)
		{
			for (int j=1; j<c; j++)
			{
				matrix[i][j]+=matrix[i][j-1];
			}
		}
		
		// travel vertically and calculate column wise prefix sum 
		
		for (int j=0; j<c; j++) // fix column
		{
			for (int i=1; i<r; i++)
			{
				matrix[i][j]+=matrix[i-1][j];
			}
		}
	}
}