import java.util.*;
public class removeSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        String[] newString=inputString.split(" ");
        Arrays.toString(newString);
        System.out.println("This is newString: " + Arrays.toString(newString));
     
        StringBuilder sb=new StringBuilder();
        for(String value:newString)
        {
            sb.append(value);
            
        }
        System.out.println("this is after Appending"+sb);

    }
    
}
