
// Q .1  Write a program to display transpose of matrix entered by the user



public class TransposeMatrix {
    
    public static void main(String[] args) {

        int[][] arr = {
            {11,21,31},
            {4,51,64},
            {7,8,29}
        };

        // check(arr,3,3);
        check2(arr,3,3);

        
    }

    // transpose inplace

    static void check2 (int[][] arr, int r, int c)
    {
        for (int i=0; i<c; i++)
        {
            for (int j=i; j<r; j++)
            {
                // ans[j][i]=arr[i][j];
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }



    }


    // ek alag array bnake
    static void check(int[][] arr,int r, int c)
    {
        int[][] ans = new int[c][r];
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                ans[j][i]=arr[i][j];
            }
        }


        for (int i=0; i<ans.length; i++)
        {
            for (int j=0; j<ans[i].length; j++)
            {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
        }


    }


}