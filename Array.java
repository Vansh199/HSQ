import java.util.*;


public class Array {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,1};
        HashMap<Integer, Integer> map = new HashMap<>();
         
    for (int element : arr) 
    {   
        if(map.get(element) == null)
        {
            map.put(element, 1);
        }
        else
        {
            map.put(element, map.get(element)+1);
        }
    }
         
    
         
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
    {               
        if(entry.getValue() > 1)
        {
           System.out.println("yes");
           break;
        }
        else{
            System.out.println("No");
            break;
        }
    }
    }
}
