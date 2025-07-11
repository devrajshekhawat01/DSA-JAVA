
import java.util.*;

public class SortStringList {
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Abhi");
        al.add("Navin");
        al.add("Gautaum");
        al.add("Akram");
        al.add("Pankaj");
        al.add("Jitesh");

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}