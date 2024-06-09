import java.util.Stack;

public class parenthesisMatching {
    static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }
    static boolean isMatching(char a, char b){
        return a== '(' && b==')' || a=='{' && b =='}' || a=='[' && b==']';
        }

    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<x.length();i++) {
            char curr = x.charAt(0);
            if (isOpening(curr)) {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false; //agar opening ni h to iska matlb closing h curr character
                //or agar closing h to iska matalb uska opening present hona chaiye
                else if (!isMatching(stack.peek(), curr)) {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
