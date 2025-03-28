import java.util.*;
public class countCharacters {
    public static void main(String[] args) {
        int whiteSpace=0, constants=0,vowels=0,digit=0,specialCharacter=0;

        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        inputString=inputString.toLowerCase();
        for(int i=0;i<inputString.length();i++)
        {
            char ch=inputString.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;

            }else if(ch==' ')
            {
                whiteSpace++;
            }else if(ch >= '0' && ch<='9')
            {
                digit++;

            }
            else if(ch>='a'&&ch<='z')
            {
                constants++;

            }
            else{
                specialCharacter++;
            }
        }

        System.out.println("Vowels"+vowels+"Constants"+constants+"WhiteSpace"+whiteSpace+"digit"+digit+"specialCharacter"+specialCharacter);
    }
    
}
