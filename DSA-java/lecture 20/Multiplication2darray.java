

public class Multiplication2darray {
    public static void main(String[] args) {
        
        int[][] arr={
            {1,2,3},
            {7,4,8}
        };

        int[][] brr={
            {1,2,3},
            {7,4,8},
            {4,3,2}
        };

        check(arr,2,3,brr,3,3);
    }

    static void check(int[][] arr,int r,int c, int[][] brr, int r1, int c1)
    {
        if (c != r1)
        {
            System.out.println("Wrong input");
            return;
        }

        int[][] sum = new int[r][c1];

        for (int i=0; i<r; i++) // rows
        {
            for (int j=0; j<c1; j++) // column
            {
                for (int k=0; k<c; k++)
                {
                sum[i][j]+=arr[i][k] * brr[k][j];

                }
            }
        }


        for (int i=0; i<r; i++) // rows
        {
            for (int j=0; j<c1; j++) // column
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}