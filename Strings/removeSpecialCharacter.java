import java.util.Scanner;

class Solution {
    String removeSpecialCharacter(String s) {
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                results.append(ch);
            }
        }
        
        if (results.length() == 0) {
            return "-1";
        }
        return results.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Solution solution = new Solution();
        String result = solution.removeSpecialCharacter(input);
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
