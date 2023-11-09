package proyectoso2;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null; // If the queue becomes empty, reset rear as well
        }
        return item;
    }
}