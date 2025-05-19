import java.util.*;
public class subStringContainingAllThree {
 public static int countSubstring(String s) {
        // code here
        int[] lastSeen={-1,-1,-1};
        int count =0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            lastSeen[ch-'a']=i;
            
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1)
            {
                int lastMin=Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
                count+=lastMin+1;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        String input="abcabc";
       
       int result=subStringContainingAllThree.countSubstring(input);
       System.out.println(result);
    }
    
}