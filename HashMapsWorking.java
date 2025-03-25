import java.util.*;

public class HashMapsWorking {
    public static void main(String[] args) {
         System.out.println("enter Array size");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		System.out.println("This is for scanner");
		for(int i=0;i<N;i++)
		{
		    arr[i]=sc.nextInt();
		}

        //Default values checks on keys then it updates the value to 0
   	 HashMap<Integer,Integer>map=new HashMap<>();
		 for(int i=0;i<arr.length;i++)
		 {
		   map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		 }

//TO Iterate over hashmap

		 for (Map.Entry<Integer,Integer> it:map.entrySet())
		 {
		     System.out.println("This is key"+it.getKey()+"this is value"+it.getValue());
		 }

// TO ITERATE USING FOREACH

map.forEach((k,v)->System.out.println("this is key"+k+"this is value"+v));

//TO DELETE AN ELEMENT USING AN ITERATOR


Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
while(it.hasNext())
{
    Map.Entry<Integer,Integer> entry=it.next();
    System.out.println("this is key"+entry.getKey()+"this is value"+entry.getValue());
    if(entry.getKey()==2)
    {
        it.remove();
    }
}
for(Map.Entry<Integer,Integer>del:map.entrySet())
{
    System.out.println("key"+del.getKey()+"value"+del.getValue());
}
		
	}
        
        
    }

