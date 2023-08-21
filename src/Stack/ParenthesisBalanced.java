package Stack;

public class ParenthesisBalanced {

    public static void main(String[] args) throws Exception {

        String str = "[{}]";

       boolean res =  isParenthesisBalanced(str);

        System.out.println(res);
    }

    private static boolean isParenthesisBalanced(String str) throws Exception {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ( ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (!isBalanced(stack.peek(), ch)) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }

        }

        return true;
    }

    static boolean isBalanced(char a, char b) {

        return  (a == '(' && b == ')' ) || (a == '{' && b == '}' ) || (a == '[' && b == ']' );

    }


}
