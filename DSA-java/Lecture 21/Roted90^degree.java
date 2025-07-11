
public class Rotate90Degree {
    public static void main(String[] args) {
        
        int[][] arr = {
            {11,21,31},
            {4,51,64},
            {7,8,29}
        };

        check2(arr,3,3);
    }



    static void check2 (int[][] arr, int r, int c)
    {
        for (int i=0; i<c; i++)
        {
            for (int j=i; j<r; j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i=0; i<arr.length; i++)
        {
            
            
                int start=0;
                int end = arr[i].length-1;

                while (start<end)
                {
                    int temp = arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;
                    start++;
                    end--;
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
}