
// Given an array ' a' consisting of integer . Return the first value that is repeating in this array if no value is being repeated return -1.

class code4{

    static int findrepeat(int[] arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    ans = arr[i];
                }
            }
        }

        if(ans==0){
            return -1;
        }
        else{
            return ans;
        }
        
    }




public static void main(String[]args){

int [] arr = {1,22,3,21,31,12};

System.out.println(findrepeat(arr));

}



}