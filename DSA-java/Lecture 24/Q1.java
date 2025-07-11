import java.util.*;
public class Question1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(142);

        l1.add(17);
        l1.add(43);
        l1.add(73);

        System.out.println(l1);
        // reverseArray(l1);
        // Collections.reverse(l1);
        // Collections.sort(l1);

        // for decending order
        Collections.sort(l1,Collections.reverseOrder());
        
        System.out.println(l1);


    }

    static void reverseArray (ArrayList<Integer> l1)
    {
        int i=0, j=l1.size() - 1;

        while (i<j)
        {
            int temp = l1.get(i);
            l1.set(i,l1.get(j));
            l1.set(j,temp);

            i++;
            j--;
        }
    }
}