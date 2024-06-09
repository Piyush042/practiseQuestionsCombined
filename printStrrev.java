import java.util.Stack;

public class printStrrev {
    static String print(String s){
        String[] sarr = s.split("\\.");
        String s1="";
        for(int i = sarr.length-1;i>=0;i--){
            s1 += sarr[i];
            s1 += ".";
        }
        return s1;
    }

        public static void reverseSentence(String s) {
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                StringBuilder word = new StringBuilder();
                while (i < s.length() && s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                    i++;
                }
                stack.push(word.toString());
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }


    public static void main(String[] args) {
        String s = "i.love.u.";
        System.out.println(print(s));
    }
}
