 class algebra {

    int a=5;
    int b=4;

    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    void show(){
        int m =3;
        int k =9;

        {
            int n=4;  //block level scope variable
            System.out.println(n);
        }
    }
}


public class code_1 {

    public static void main(String[] args) {

        algebra a = new algebra();
        a.show();
       
    }
}