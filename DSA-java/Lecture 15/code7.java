
// Count the number of element strictly greater than value x

/*

array = [2,3 ,4,5,44,8]
x = 6
number of element = 2 (44,8)
*/

// import java.util.*;

class code7{

    static int checkarray(int []arr ,int i){
        int sum =0;
        for(int j=0; j<arr.length; j++){
            if (arr[j]>i){
                sum+=1;
            }
           
        }
         return sum;
    }

    public static void main (String[]args){

        int []arr = {12,3,45,22,33,3,3,4,3};
        System.out.println("Total elements are  : "+ checkarray(arr,12));
    }
}