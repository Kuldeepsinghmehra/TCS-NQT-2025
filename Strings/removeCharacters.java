import java.util.HashSet;
import java.util.Set;

public class removeCharacters {
     public static String removeCharacters(String str1, String str2) {
        // Store characters of str2 in a HashSet for quick lookup
        Set<Character> set = new HashSet<>();
        for (char ch : str2.toCharArray()) {
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : str1.toCharArray()) {
            if (!set.contains(ch)) { // Append only if not in str2
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";

        System.out.println(removeCharacters(str1, str2));
    }
    
}
