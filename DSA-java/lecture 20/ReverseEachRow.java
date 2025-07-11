
// ek 2d array ke sabhi element ko reverse karna ha 

public class ReverseEachRow {
    
    public static void main(String[] args) {
        
        int[][] brr={
            {1,2,3},
            {7,4,8},
            {4,3,2}
        };

        Reverse(brr);
    }

    static void Reverse(int[][] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
                int start=0;
                int end=arr[i].length-1;
            for (int j=0; j<=arr[i].length; j++)
            {
                while (start<end)
                {
                    int temp = arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;
                    start++;
                    end--;
                }

            }
        }

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}