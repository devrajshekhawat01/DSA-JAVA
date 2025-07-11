
public class Add2DArray {
    public static void main(String[] args) {
        
        int[][] arr={
            {1,2,3},
            {7,4,8}
        };

        int[][] brr={
            {1,2,3},
            {7,4,8}
        };

        check(arr,2,3,brr,2,3);
    }

    static void check(int[][] arr,int r,int c, int[][] brr, int r1, int c1)
    {
        if (r != r1 || c != c1)
        {
            System.out.println("Wrong input");
            return;
        }

        int[][] sum = new int[r][c];

        for (int i=0; i<r; i++) // rows
        {
            for (int j=0; j<c; j++) // column
            {
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }


        for (int i=0; i<r; i++) // rows
        {
            for (int j=0; j<c; j++) // column
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}