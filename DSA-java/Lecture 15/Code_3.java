
class code3{

    static void printarray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

public static void main (String[]args)
{

int []arr = new int[3];

arr[0]=2;
arr[1]=4;
arr[2]=3;

int []arr_2 = arr.clone();  // copy of the array called deep copy

arr_2[0]=9;
arr_2[1]=9;
arr_2[2]=9;

printarray(arr);

printarray(arr_2);




}
}