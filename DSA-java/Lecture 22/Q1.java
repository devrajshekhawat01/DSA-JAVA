
public class Question1 {
    
    public static void main(String[] args) {

        int [][]arr={
            {1,2,3},
            {3,5,6},
            {9,4,2},
            {2,3,4}
        };

        check(arr,4,3);
        
    }


    static void check(int[][] arr,int r ,int c)
    {
        int topRow=0, bottomRow = r-1, leftCol =0, rightCol=c-1;

       int totalEle=0;
        while(totalEle < r*c){
            // topRow -> leftCol to RightCol

            for (int j=leftCol; j<=rightCol && totalEle < r*c; j++)
            {
                System.out.println(arr[topRow][j]+" ");
                totalEle++;
            }
            topRow++;

            // rightCol -> topRow to Bottomrow

            for (int i=topRow; i<=bottomRow && totalEle < r*c; i++)
            {
                System.out.println(arr[i][rightCol]+" ");
                totalEle++;
            }
            rightCol--;


            // BottomRow -> rightCol to leftCol

            for (int j=rightCol; j>=leftCol && totalEle < r*c; j--)
            {
                System.out.println(arr[bottomRow][j]+" ");
                totalEle++;
            }
            bottomRow--;

            // leftCol -> bottomROw to topRow

            for (int i=bottomRow; i>=topRow && totalEle < r*c; i--)
            {
                System.out.println(arr[i][leftCol]+" ");
                totalEle++;
            }
            leftCol++;
        }
    }
}