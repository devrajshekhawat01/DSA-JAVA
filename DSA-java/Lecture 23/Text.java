
class Test {
	
	public static void main(String[]a)
	{
		int[][] arr = {
			{1,2,3,4,5},
			{6,6,2,3,1},
			{3,4,1,3,1},
			{3,4,6,8,1},
			{4,5,2,4,2}				
		};
		
		System.out.println(findSum(arr,1,0,4,4));
		
	}
	
	static int findSum(int[][] arr, int l1, int r1, int l2, int r2)
	{
		int sum = 0;
		
		for(int i=l1; i<=l2; i++)
		{
			for (int j=r1; j<=r2; j++)
			{
				sum+=arr[i][j];
			}
		}
		
		return sum;
	}
}