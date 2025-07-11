class code_1{

    void demoarray(){

        int []ages = new int[3];
        float []weight = new float[4];
        String []name = new String[4];

        ages[0]=22;
        ages[1]=24;
        ages[2]=21;

        // ages[3]=23;


        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);

        // System.out.println(ages.length);

        // for (int i=0; i<3; i++){
        //     System.out.println(ages[i]);
        // }


        // for(int age : ages){   //age = ages[0] ages[1] ........
        //     System.out.println(age);
        // }


        int i=0;
        while(i<3){
            System.out.println(ages[i]);
			i++;
            
        }




    }
    
    public static void main(String[]args){

        code_1 obj = new code_1();
        obj.demoarray();

    }
}