import java.util.Scanner;
public class PascleAngle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] ans = Pascle(n);


        for (int i=0; i<ans.length; i++)
        {
            for (int j=0; j<ans[i].length; j++)
            {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
        }

    }

    static int[][] Pascle(int n)
    {
        int[][] ans = new int[n][];

        for (int i=0; i<n; i++)
        {
            // ith row has i+1 column
            ans[i]=new int[i+1];
            // 1st and last element is zero
            ans[i][0]=ans[i][i]=1;

            for (int j=1; j<i; j++)
            {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }


        return ans;
    }
}