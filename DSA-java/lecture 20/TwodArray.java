import java.util.Scanner;
public class TwoDArray {
    
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // 2d array input
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        printArray(arr);

        int[][] brr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printArray(brr);



        
    }

        // Print the array
        static void printArray(int[][] brr)
        {
            for (int i=0; i<brr.length; i++)
            {
                for (int j=0; j<brr[i].length; j++)
                {
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }
        }
}