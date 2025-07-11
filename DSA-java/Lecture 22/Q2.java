
// Given a positive integer n generate an n*n matrix filled with element from 1 to n^2 in spiral order

import java.util.Scanner;
public class Question2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] ans = check(n);

        for (int i=0; i<ans.length; i++)
        {
            for (int j=0; j<ans[i].length; j++)
            {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
        }


    }

    static int[][] check(int n)
    {
        int [][] arr = new int[n][n];
         int topRow=0, bottomRow = n-1, leftCol =0, rightCol=n-1;

       int totalEle=0;
       int currInt=1;
        while(totalEle < n*n){
            // topRow -> leftCol to RightCol

            for (int j=leftCol; j<=rightCol && totalEle < n*n; j++)
            {
                arr[topRow][j]=currInt++;
                totalEle++;
            }
            topRow++;

            // rightCol -> topRow to Bottomrow

            for (int i=topRow; i<=bottomRow && totalEle < n*n; i++)
            {
                arr[i][rightCol]=currInt++;
                totalEle++;
            }
            rightCol--;


            // BottomRow -> rightCol to leftCol

            for (int j=rightCol; j>=leftCol && totalEle < n*n; j--)
            {
                arr[bottomRow][j]=currInt++;
                totalEle++;
            }
            bottomRow--;

            // leftCol -> bottomROw to topRow

            for (int i=bottomRow; i>=topRow && totalEle < n*n; i--)
            {
                arr[i][leftCol]=currInt++;
                totalEle++;
            }
            leftCol++;
        }

        return arr;
    }
}