package Stack;


import java.util.ArrayList;

class Stack<T> {

    private ArrayList<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return  list.remove(list.size() - 1);
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return  list.get(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return  list.isEmpty();
    }
}

public class StackImplementation {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        System.out.println("stack peek " +stack.peek());
        System.out.println("Stack pop " +stack.pop());
        System.out.println("stack peek " + stack.peek());


        System.out.println("stack size " +stack.size());

    }
}
