// find second smallest elements


class FindSecSmallest{

    static int findmin(int []arr){
        int mx = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondmin(int []arr){
        int mx = findmin(arr);
        for(int i=0; i<arr.length; i++){
            if (arr[i]==mx){
                arr[i]= Integer.MAX_VALUE;
            }
        }
        int secondmx = findmin(arr);
        return secondmx;
    }


public static void main(String[]args){

    int [] arr = {0,2,11,78};

    System.out.println(secondmin(arr));

}

}