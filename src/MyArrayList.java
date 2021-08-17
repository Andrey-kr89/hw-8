import java.util.Arrays;

public class MyArrayList<T> {
    private T[] elements;
    private int current = 0;

    public MyArrayList() {
        this.elements = (T[]) new Object[]{};
    }

    public void add(T value) {
        this.elements = Arrays.copyOf(elements, size() + 1);
        this.elements[current] = value;
        current++;
    }

    public void remove(int index) {
        for (int i = index; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.elements = Arrays.copyOf(elements, size() - 1);
        current--;
    }

    public void clear() {
        elements = (T[]) new Object[]{};
        current = 0;
    }

    public int size() {
        return elements.length;
    }

    public Object get(int index) {
        return elements[index];
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size(); i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
