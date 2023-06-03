import java.util.*;

public class Tree{
    public static void main(String[] args) {
        
        //sorted data on the basis of the keys
        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(5, "Rahul");
        map2.put(7, "Lakshman");
        map2.put(1, "Ram");
        map2.put(4, "Krrish");
        map2.put(2, "Lakshay");
        System.out.println("TreeMap class Looks Like: "+map2);
    }
}