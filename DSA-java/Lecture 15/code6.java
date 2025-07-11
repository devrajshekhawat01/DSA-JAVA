

//  Find the last occurence of an element x in a given array

/*

arr = [2,3,2,4,5]
x =4
last occurence at 3 index

*/

// import java.util.*;

class code6{

    static int checkarray(int []arr ,int i){
        int sum =0;
        for(int j=0; j<arr.length; j++){
            if (arr[j]==i){
                sum=j;
            }
           
        }
         return sum;
    }

    public static void main (String[]args){

        int []arr = {12,3,45,2,3,3,3,4,3};
        System.out.println("last occurence at  : "+ checkarray(arr,12));
    }
}