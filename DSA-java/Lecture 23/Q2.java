
// Method 2 : Pre calculating the horizontal sum for each row in the matrix

class Question2 {
	
	public static void main(String[] args)
	{
		int[][] arr = {
			{1,2,3,4,5},
			{6,6,2,3,1},
			{3,4,1,3,1},
			{3,4,6,8,1},
			{4,5,2,4,2}				
		};
		
		System.out.println(findSum(arr,0,0,0,0));
		
	}
	
	static int findSum(int[][] arr, int l1, int r1, int l2, int r2)
	{
		int sum = 0;
		
		findPrefixSumMatrix(arr);
		
		for (int i=l1; i<=l2; i++)
		{
			if (r1>=1)
			{
				sum+=arr[i][r2]-arr[i][r1-1];
			}
			else {
				sum+=arr[i][r2];
			}
			
		}
		
		return sum;
	}

	
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
	}
}