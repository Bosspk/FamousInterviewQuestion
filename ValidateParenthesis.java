import java.util.Scanner;
import java.util.Stack;

public class ValidateParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("isValid:" + isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) {
                    return false;
                }
                char c = st.pop();
                if ((s.charAt(i) == ')' && c != '(') || (s.charAt(i) == '}' && c != '{') || (
                    s.charAt(i) == ']' && c != '[')) {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
