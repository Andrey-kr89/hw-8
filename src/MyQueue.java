import java.util.Arrays;

public class MyQueue<T> {
    private T[] elements;
    private int current = 0;

    public MyQueue() {
        this.elements = (T[]) new Object[]{};
    }

    public void add(T value) {
        this.elements = Arrays.copyOf(elements, size() + 1);
        this.elements[current] = value;
        current++;
    }

    public int size() {
        return elements.length;
    }

    public void remove(int index) {
        for (int i = index; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.elements = Arrays.copyOf(elements, size() - 1);
        current--;
    }

    public T poll() {
        Object temp = elements[0];
        remove(0);
        return (T) temp;
    }

    public T peek() {
        return elements[0];
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size(); i++) {
            System.out.print(elements[i] + " ");
        }
    }

}
