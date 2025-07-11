// //multidimensional arrays


class code_2{

    public static void main(String[]args){

        // int [][]sum = new int[3][3];
        int [][]multidimensional = {{1,2,3},{4,5,6},{7,8,9}};

        // System.out.println(multidimensional[1][2]);

        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print(multidimensional[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(multidimensional.length);

    }

}



// class code_2{

//      public static void main(String[]args){

//         int [][]multidimensional = {{1,2,3},{4,5,6},{7,8,9}};

//         int i=0;
//         int j=0;

//         while (i<3){

//             while(j<3){
//                 System.out.println(multidimensional[i][j]+" ");
//                 j+=1;
//             }
//             i+=1;
//             System.out.println("");

//         }



//      }


// }