
// change the value of an array

import java.util.*;

class code2{

    static void change_array(int[] arr){
        for (int i=0; i<arr.length; i++)
          {  arr[i]=0;
          }
        
    }

    public static void main(String[]args){

        int []arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        change_array(arr);

        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}