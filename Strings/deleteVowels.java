import java.util.*;
public class deleteVowels {
    public static void main(String[] args) {
        System.out.println("Enter Your String");
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        // inputString=inputString.toLowerCase();
        // StringBuilder sb=new StringBuilder(inputString);
        // for(int i=inputString.length()-1;i>0;i--)
        // {
        //     char ch=sb.charAt(i);
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        //     {
        //         sb.deleteCharAt(i);
        //     }
        // }

        // System.out.println("this is without vowel"+sb);
        inputString=inputString.replaceAll("[aeiou]", "");
        System.out.println(inputString);
    }
    
    
}
