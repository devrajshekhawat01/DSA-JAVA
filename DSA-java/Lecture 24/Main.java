
import java.util.*; 
public class Main {
    
    public static void main(String[] args) {
        
        // Wrapper class
        // Integer i = new Integer(12);
        // Integer i = Integer.valueOf(23);
        // System.out.println(i);

        // Float f = Float.valueOf(12.33f);
        // System.out.println(f);


        ArrayList <Integer> ak = new ArrayList<>();

        // add new element
        ak.add(12);
        ak.add(21);
        ak.add(78);
        
        // System.out.println(ak.get(2));

        // for (int i=0; i<ak.size(); i++)
        // {
        //     System.out.println(ak.get(i));
        // }

        // print directly
        System.out.println(ak);

        // adding element at index i
        ak.add(1,123);
        System.out.println(ak);


        // modify element
        ak.set(0,1222);
        System.out.println(ak);


        // remove the element at specific element
        ak.remove(1);
        System.out.println(ak);

        // remove the specific item
        System.out.println(ak.remove((Integer)78));
        System.out.println(ak);



        // check element is exist or not
        System.out.println(ak.contains(12));



        ArrayList ak2 = new ArrayList();
        ak2.add(12);
        ak2.add("hww");
        ak2.add(true);
        System.out.println(ak2);
        

        



    }
}