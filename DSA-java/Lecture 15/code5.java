

// Count the number of occurence of a particular element x 

/*

arr   =  [2,3,2,33,2]
x =2
occurence =3

*/

import java.util.*;

class code5{

    static int checkarray(int []arr ,int i){
        int sum =0;
        for(int j=0; j<arr.length; j++){
            if (arr[j]==i){
                sum=sum+1;
            }
        }
        return sum;
    }

    public static void main (String[]args){

        int []arr = {12,3,45,2,3,3,3,4,3};
        System.out.println("Total occurence : "+ checkarray(arr,3));
    }
}

