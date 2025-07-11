
// Find the total number of pairs in the array whose some is equal to the given value x.


// class code1{

//     static int checkarray(int []arr, int n){
//         int sum=0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]+arr[j]==n){
//                     sum++;
//                 }
//             }
//         }
//         return sum;
//     }


//     public static void main(String[]args)
//     {
//         int []arr = {2,3,4,5,8,1,11};

//         System.out.println(checkarray(arr,7));
//     }
// }




// three element of pairs

class code1{

    static int checkarray(int []arr, int n){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               for(int k=j+1; k<arr.length; k++){
                  if(arr[i]+arr[j]+arr[k]==n){
                    sum++;
                     }
            }
        }
        
    }
    return sum;
    }


    public static void main(String[]args)
    {
        int []arr = {1,4,5,6,3};

        System.out.println(checkarray(arr,12));
    }
}