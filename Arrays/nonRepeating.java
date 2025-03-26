import java.util.*;
public class nonRepeating {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
      Map<Integer,Integer>map=new LinkedHashMap<>();
      for(int x:arr)
      {
            map.put(x,map.getOrDefault(x,0)+1);
          
      }
      for(Map.Entry<Integer,Integer>entry:map.entrySet())
      {
          if(entry.getValue().equals(1))
          {
              return entry.getKey();
              
          }
      
      }
          return 0;
        
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,1,2,3,4};
        nonRepeating nr=new nonRepeating();
        nr.firstNonRepeating(arr);

    }
    
}
