package Stack;

public class ReverseTheLetterOfWord {

    public static void main(String[] args) throws Exception {

        String str = "Hello World";

        reverseTheLetter(str);

    }

    static void reverseTheLetter(String str) throws Exception {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
            }
            else {
                while (stack.isEmpty() == false) {
                    System.out.println(stack.pop());
                }

                System.out.println(" ");
            }
        }

        // for the last word
        while (stack.isEmpty() == false) {
            System.out.println(stack.pop());
        }
    }
}
