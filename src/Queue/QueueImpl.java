package Queue;

import java.util.ArrayList;

class MyQueue<T> {
    // List
    private ArrayList<T> list;

    // constructor
    public MyQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public T front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.get(0);
    }

    public T rear() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.get( size() - 1);
    }
}

public class QueueImpl {


    public static void main(String[] args) throws Exception {

        MyQueue<Integer> queue1 = new MyQueue<>();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        System.out.println("Font element " + queue1.front());
        System.out.println("Rear element " + queue1.rear());

        System.out.println("size of the queue "+ queue1.size());

        System.out.println("Dequeue element "+ queue1.dequeue());

        System.out.println("Font element " + queue1.front());
        System.out.println("Rear element " + queue1.rear());

        System.out.println("size of the queue "+ queue1.size());

        factorial(5);

    }

    private static void factorial(int i) {


    }

}
