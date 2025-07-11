
// Program to find the second largest elements in the given array

class code3{

    static int findmax(int []arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondmax(int []arr){
        int mx = findmax(arr);
        for(int i=0; i<arr.length; i++){
            if (arr[i]==mx){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondmx = findmax(arr);
        return secondmx;
    }


public static void main(String[]args){

    int [] arr = {0,2,1};

    System.out.println(secondmax(arr));

}

}
